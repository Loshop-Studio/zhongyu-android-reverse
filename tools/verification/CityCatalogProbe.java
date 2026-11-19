import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.os.Looper;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/** Reads the two bundled city catalogs with the launcher's original Android code. */
public final class CityCatalogProbe {
    public static void main(String[] args) throws Exception {
        Looper.prepareMainLooper();
        final AssetManager assets = AssetManager.class.getConstructor().newInstance();
        int cookie = (Integer) AssetManager.class.getMethod("addAssetPath", String.class).invoke(assets, args[0]);
        if (cookie == 0) throw new IllegalStateException("Cannot read APK assets");
        Context context = new ContextWrapper(null) {
            @Override public AssetManager getAssets() { return assets; }
        };
        Class<?> appType = Class.forName("com.zykj.huiwei.launcher.app.App");
        Application app = (Application) appType.getConstructor().newInstance();
        Method attach = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
        attach.setAccessible(true);
        attach.invoke(app, context);
        appType.getField("app").set(null, app);

        Class<?> weather = Class.forName("i4.o");
        Object index = weather.getField("a").get(null);
        weather.getMethod("b").invoke(index);
        @SuppressWarnings("unchecked")
        Map<String,String> locations = (Map<String,String>) weather.getField("c").get(null);
        JSONObject output = new JSONObject();
        output.put("weather", new JSONObject(new TreeMap<>(locations)));
        output.put("missing_city", weather.getMethod("a", String.class).invoke(index, "本地测试·没有该城市"));

        Class<?> wheel = Class.forName("com.lljjcoder.citywheel.CityParseHelper");
        Object picker = wheel.getConstructor().newInstance();
        wheel.getMethod("initData", Context.class).invoke(picker, context);
        List<?> provinces = (List<?>) wheel.getMethod("getProvinceBeanArrayList").invoke(picker);
        JSONArray nodes = new JSONArray();
        for (Object province : provinces) collect(province, nodes, 0);
        output.put("picker", nodes);
        output.put("district_lookup_size", ((Map<?,?>) wheel.getMethod("getDisMap").invoke(picker)).size());
        System.out.println(output.toString());
    }

    private static void collect(Object node, JSONArray rows, int depth) throws Exception {
        Class<?> type = node.getClass();
        JSONArray row = new JSONArray();
        row.put(depth);
        row.put(type.getMethod("getId").invoke(node));
        row.put(type.getMethod("getName").invoke(node));
        rows.put(row);
        if (depth < 2) {
            for (Object child : (List<?>) type.getMethod("getCityList").invoke(node)) {
                collect(child, rows, depth + 1);
            }
        }
    }
}
