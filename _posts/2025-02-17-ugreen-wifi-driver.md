## Installing Drivers for UGREEN AX900 WiFi Adapter (AICSemi AIC 8800D80) - [02.12.2024]
### Introduction
### Prerequisites:
Step 1 - Download the Driver
Step 2 - Unpack and patch the Driver
Step 2.1 - Fix Driver
Step 3 - Install Driver
Introduction
This guide walks you through installing and fixing the driver for the UGREEN AX900 WiFi Adapter on Linux systems.

Prerequisites:
sudo apt update sudo apt install -y sudo unzip build-essential linux-headers-$(uname -r)

Step 1 - Download the Driver
Visit the official download page: UGREEN AX900 WiFi Driver

Step 2 - Unpack and patch the Driver
The current V1.2 Version of the CM762-35264 driver contains a bug for kernels > 6.3.0.

This might already be fixed with newer versions.

unzip CM762-35264.zip -d CM762

Step 2.1 - Fix Driver
This only needs to be done if you're kernel is > 6.3.0 and the driver is > V1.2

cd CM762/Linux/linux_driver_package/
dpkg-deb -R aic8800d80fdrvpackage.deb tmp
modify line 471 in tmp/usr/src/AIC8800/drivers/aic8800/aic8800_fdrv/rwnx_rx.c

OLD:

        ieee80211_amsdu_to_8023s(skb, &list, rwnx_vif->ndev->dev_addr,
                                 RWNX_VIF_TYPE(rwnx_vif), 0, NULL, NULL);
NEW:

        ieee80211_amsdu_to_8023s(skb, &list, rwnx_vif->ndev->dev_addr,
                                 RWNX_VIF_TYPE(rwnx_vif), 0, NULL, NULL, false);
Repack the driver:

dpkg-deb -b tmp fixed-driver.deb

Step 3 - Install Driver
dpkg -i fixed-driver.deb

The driver for the UGREEN AX900 should now be installed and functional! You can verify the installation by checking your network settings or using commands like:

iwconfig dmesg | grep aic

