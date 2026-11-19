package org.eclipse.paho.client.mqttv3.internal;

import com.taobao.accs.common.Constants;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;
import org.eclipse.paho.client.mqttv3.spi.NetworkModuleFactory;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* loaded from: classes6.dex */
public class NetworkModuleService {
    private static final int AUTH_GROUP_HOST = 3;
    private static final int AUTH_GROUP_PORT = 5;
    private static final int AUTH_GROUP_USERINFO = 2;
    private static Logger LOG = LoggerFactory.getLogger(LoggerFactory.MQTT_CLIENT_MSG_CAT, NetworkModuleService.class.getSimpleName());
    private static final ServiceLoader<NetworkModuleFactory> FACTORY_SERVICE_LOADER = ServiceLoader.load(NetworkModuleFactory.class, NetworkModuleService.class.getClassLoader());
    private static final Pattern AUTHORITY_PATTERN = Pattern.compile("((.+)@)?([^:]*)(:(\\d+))?");

    private NetworkModuleService() {
    }

    public static void applyRFC3986AuthorityPatch(URI uri) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (uri == null || uri.getHost() != null || uri.getAuthority() == null || uri.getAuthority().isEmpty()) {
            return;
        }
        Matcher matcher = AUTHORITY_PATTERN.matcher(uri.getAuthority());
        if (matcher.find()) {
            setURIField(uri, Constants.KEY_USER_ID, matcher.group(2));
            setURIField(uri, Constants.KEY_HOST, matcher.group(3));
            String strGroup = matcher.group(5);
            setURIField(uri, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(strGroup != null ? Integer.parseInt(strGroup) : -1));
        }
    }

    public static NetworkModule createInstance(String str, MqttConnectOptions mqttConnectOptions, String str2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            URI uri = new URI(str);
            applyRFC3986AuthorityPatch(uri);
            String lowerCase = uri.getScheme().toLowerCase();
            ServiceLoader<NetworkModuleFactory> serviceLoader = FACTORY_SERVICE_LOADER;
            synchronized (serviceLoader) {
                try {
                    Iterator<NetworkModuleFactory> it = serviceLoader.iterator();
                    while (it.hasNext()) {
                        NetworkModuleFactory next = it.next();
                        if (next.getSupportedUriSchemes().contains(lowerCase)) {
                            return next.createNetworkModule(uri, mqttConnectOptions, str2);
                        }
                    }
                    throw new IllegalArgumentException(uri.toString());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException(str, e10);
        }
    }

    private static void setURIField(URI uri, String str, Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = URI.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(uri, obj);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException e10) {
            LOG.warning(NetworkModuleService.class.getName(), "setURIField", "115", new Object[]{uri.toString()}, e10);
        }
    }

    public static void validateURI(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme == null || scheme.isEmpty()) {
                throw new IllegalArgumentException("missing scheme in broker URI: " + str);
            }
            String lowerCase = scheme.toLowerCase();
            ServiceLoader<NetworkModuleFactory> serviceLoader = FACTORY_SERVICE_LOADER;
            synchronized (serviceLoader) {
                try {
                    Iterator<NetworkModuleFactory> it = serviceLoader.iterator();
                    while (it.hasNext()) {
                        NetworkModuleFactory next = it.next();
                        if (next.getSupportedUriSchemes().contains(lowerCase)) {
                            next.validateURI(uri);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("no NetworkModule installed for scheme \"" + lowerCase + "\" of URI \"" + str + "\"");
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Can't parse string to URI \"" + str + "\"", e10);
        }
    }
}
