package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.autofill.HintConstants;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.blankj.utilcode.util.ShellUtils;
import com.taobao.accs.utl.UtilityImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class DeviceUtils {
    private static final String KEY_UDID = "KEY_UDID";
    private static volatile String udid;

    private DeviceUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String[] getABIs() {
        return Build.SUPPORTED_ABIS;
    }

    @SuppressLint({"HardwareIds"})
    public static String getAndroidID() {
        String string = Settings.Secure.getString(Utils.getApp().getContentResolver(), "android_id");
        return ("9774d56d682e549c".equals(string) || string == null) ? "" : string;
    }

    private static InetAddress getInetAddress() throws SocketException {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && inetAddressNextElement.getHostAddress().indexOf(58) < 0) {
                            return inetAddressNextElement;
                        }
                    }
                }
            }
            return null;
        } catch (SocketException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"})
    public static String getMacAddress() throws SocketException {
        String macAddress = getMacAddress(null);
        if (!TextUtils.isEmpty(macAddress) || getWifiEnabled()) {
            return macAddress;
        }
        setWifiEnabled(true);
        setWifiEnabled(false);
        return getMacAddress(null);
    }

    private static String getMacAddressByFile() {
        String str;
        String str2;
        ShellUtils.CommandResult commandResultExecCmd = UtilsBridge.execCmd("getprop wifi.interface", false);
        if (commandResultExecCmd.result != 0 || (str = commandResultExecCmd.successMsg) == null) {
            return "02:00:00:00:00:00";
        }
        ShellUtils.CommandResult commandResultExecCmd2 = UtilsBridge.execCmd("cat /sys/class/net/" + str + "/address", false);
        return (commandResultExecCmd2.result != 0 || (str2 = commandResultExecCmd2.successMsg) == null || str2.length() <= 0) ? "02:00:00:00:00:00" : str2;
    }

    private static String getMacAddressByInetAddress() {
        NetworkInterface byInetAddress;
        byte[] hardwareAddress;
        try {
            InetAddress inetAddress = getInetAddress();
            if (inetAddress == null || (byInetAddress = NetworkInterface.getByInetAddress(inetAddress)) == null || (hardwareAddress = byInetAddress.getHardwareAddress()) == null || hardwareAddress.length <= 0) {
                return "02:00:00:00:00:00";
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : hardwareAddress) {
                sb2.append(String.format("%02x:", Byte.valueOf(b10)));
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    private static String getMacAddressByNetworkInterface() throws SocketException {
        byte[] hardwareAddress;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement != null && networkInterfaceNextElement.getName().equalsIgnoreCase("wlan0") && (hardwareAddress = networkInterfaceNextElement.getHardwareAddress()) != null && hardwareAddress.length > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : hardwareAddress) {
                        sb2.append(String.format("%02x:", Byte.valueOf(b10)));
                    }
                    return sb2.substring(0, sb2.length() - 1);
                }
            }
            return "02:00:00:00:00:00";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    private static String getMacAddressByWifiInfo() {
        WifiInfo connectionInfo;
        try {
            WifiManager wifiManager = (WifiManager) Utils.getApp().getApplicationContext().getSystemService(UtilityImpl.NET_TYPE_WIFI);
            if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
                return "02:00:00:00:00:00";
            }
            String macAddress = connectionInfo.getMacAddress();
            return !TextUtils.isEmpty(macAddress) ? macAddress : "02:00:00:00:00:00";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getModel() {
        String str = Build.MODEL;
        return str != null ? str.trim().replaceAll("\\s*", "") : "";
    }

    public static int getSDKVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    public static String getSDKVersionName() {
        return Build.VERSION.RELEASE;
    }

    private static String getUdid(String str, String str2) {
        if (str2.equals("")) {
            return str + UUID.randomUUID().toString().replace("-", "");
        }
        return str + UUID.nameUUIDFromBytes(str2.getBytes()).toString().replace("-", "");
    }

    public static String getUniqueDeviceId() {
        return getUniqueDeviceId("", true);
    }

    private static String getUniqueDeviceIdReal(String str) {
        try {
            String androidID = getAndroidID();
            if (!TextUtils.isEmpty(androidID)) {
                return saveUdid(str + 2, androidID);
            }
        } catch (Exception unused) {
        }
        return saveUdid(str + 9, "");
    }

    private static boolean getWifiEnabled() {
        WifiManager wifiManager = (WifiManager) Utils.getApp().getSystemService(UtilityImpl.NET_TYPE_WIFI);
        if (wifiManager == null) {
            return false;
        }
        return wifiManager.isWifiEnabled();
    }

    @RequiresApi(api = 17)
    public static boolean isAdbEnabled() {
        return Settings.Secure.getInt(Utils.getApp().getContentResolver(), "adb_enabled", 0) > 0;
    }

    private static boolean isAddressNotInExcepts(String str, String... strArr) {
        if (TextUtils.isEmpty(str) || "02:00:00:00:00:00".equals(str)) {
            return false;
        }
        if (strArr != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (str2 != null && str2.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    @RequiresApi(api = 17)
    public static boolean isDevelopmentSettingsEnabled() {
        return Settings.Global.getInt(Utils.getApp().getContentResolver(), "development_settings_enabled", 0) > 0;
    }

    public static boolean isDeviceRooted() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/", "/system/sbin/", "/usr/bin/", "/vendor/bin/"};
        for (int i10 = 0; i10 < 11; i10++) {
            if (new File(strArr[i10] + "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmulator() {
        String networkOperatorName;
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.toLowerCase().contains("vbox") && !str.toLowerCase().contains("test-keys")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
                    networkOperatorName = "";
                }
                if (networkOperatorName.toLowerCase().equals(DispatchConstants.ANDROID)) {
                    return true;
                }
                Intent intent = new Intent();
                intent.setData(Uri.parse("tel:123456"));
                intent.setAction("android.intent.action.DIAL");
                return intent.resolveActivity(Utils.getApp().getPackageManager()) == null || isEmulatorByCpu();
            }
        }
        return true;
    }

    private static boolean isEmulatorByCpu() throws IOException {
        String cpuInfo = readCpuInfo();
        return cpuInfo.contains("intel") || cpuInfo.contains("amd");
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET", "android.permission.CHANGE_WIFI_STATE"})
    public static boolean isSameDevice(String str) throws SocketException {
        if (TextUtils.isEmpty(str) && str.length() < 33) {
            return false;
        }
        if (str.equals(udid) || str.equals(UtilsBridge.getSpUtils4Utils().getString(KEY_UDID, null))) {
            return true;
        }
        int length = str.length();
        int i10 = length - 33;
        int i11 = length - 32;
        String strSubstring = str.substring(i10, i11);
        if (strSubstring.startsWith("1")) {
            String macAddress = getMacAddress();
            if (macAddress.equals("")) {
                return false;
            }
            return str.substring(i11).equals(getUdid("", macAddress));
        }
        if (!strSubstring.startsWith("2")) {
            return false;
        }
        String androidID = getAndroidID();
        if (TextUtils.isEmpty(androidID)) {
            return false;
        }
        return str.substring(i11).equals(getUdid("", androidID));
    }

    public static boolean isTablet() {
        return (Resources.getSystem().getConfiguration().screenLayout & 15) >= 3;
    }

    private static String readCpuInfo() throws IOException {
        try {
            Process processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), "utf-8"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return sb2.toString().toLowerCase();
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            return "";
        }
    }

    private static String saveUdid(String str, String str2) {
        udid = getUdid(str, str2);
        UtilsBridge.getSpUtils4Utils().put(KEY_UDID, udid);
        return udid;
    }

    @RequiresPermission("android.permission.CHANGE_WIFI_STATE")
    private static void setWifiEnabled(boolean z10) {
        WifiManager wifiManager = (WifiManager) Utils.getApp().getSystemService(UtilityImpl.NET_TYPE_WIFI);
        if (wifiManager == null || z10 == wifiManager.isWifiEnabled()) {
            return;
        }
        wifiManager.setWifiEnabled(z10);
    }

    public static String getUniqueDeviceId(String str) {
        return getUniqueDeviceId(str, true);
    }

    public static String getUniqueDeviceId(boolean z10) {
        return getUniqueDeviceId("", z10);
    }

    public static String getUniqueDeviceId(String str, boolean z10) {
        if (!z10) {
            return getUniqueDeviceIdReal(str);
        }
        if (udid == null) {
            synchronized (DeviceUtils.class) {
                try {
                    if (udid == null) {
                        String string = UtilsBridge.getSpUtils4Utils().getString(KEY_UDID, null);
                        if (string != null) {
                            udid = string;
                            return udid;
                        }
                        return getUniqueDeviceIdReal(str);
                    }
                } finally {
                }
            }
        }
        return udid;
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE"})
    public static String getMacAddress(String... strArr) throws SocketException {
        String macAddressByNetworkInterface = getMacAddressByNetworkInterface();
        if (isAddressNotInExcepts(macAddressByNetworkInterface, strArr)) {
            return macAddressByNetworkInterface;
        }
        String macAddressByInetAddress = getMacAddressByInetAddress();
        if (isAddressNotInExcepts(macAddressByInetAddress, strArr)) {
            return macAddressByInetAddress;
        }
        String macAddressByWifiInfo = getMacAddressByWifiInfo();
        if (isAddressNotInExcepts(macAddressByWifiInfo, strArr)) {
            return macAddressByWifiInfo;
        }
        String macAddressByFile = getMacAddressByFile();
        return isAddressNotInExcepts(macAddressByFile, strArr) ? macAddressByFile : "";
    }
}
