Android library designed to facilitate the collect device information directly invoking our services without invoking the origin server.

Current version: v1.0.0

## Benefits:
- It is the easiest and fastest way to integrate a device collect information.
## Installation
1. Download de latest SDK released version.
2. You must have installed the Android SDK with API Level 27-29.
3. Add the openpaycontrol library (opencontrol-v1.0.0.aar) to your project.
## Configuration
Before you can use opencontrol-mobile-android-example is necessary to configure: merchant id, public key, user name and production Mode

The merchant id, public key and user name were assigned when you created your account. With these data, Opencontrol can identify the account.

You must configure opencontrol when instatiate it:
```java
Opencontrol opencontrol = new Opencontrol(merchantId,publicKey,userName,productionMode);
```
## Enable sandbox Mode
To test your implementation, there Sandox environment, which is enabled when you pass **false** value to parameter **productionMode**

**Notes: _You should never use your private key along with the library, because it is visible on the client side._

## Fraud detection using device data

OpenControl can collect the device information. To do this, add the following code to your activity or fragment:

```java
String deviceIdString = opencontrol.getDeviceCollectorDefaultImpl().setup(activity);
```

This method generates an identifier for the customer's device data. This value needs to be stored during checkout, and sent to Opencontrol.

The method takes one parameter:

Activity. The actual activity object.

Take a look at the [opencontrol-mobile-android-example](https://github.com/opencontrol-develop/opencontrol-mobile-android-example) application to see everything put together.
