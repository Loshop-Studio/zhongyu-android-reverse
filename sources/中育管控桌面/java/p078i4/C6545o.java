package p078i4;

import com.zykj.huiwei.launcher.app.App;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: i4.o */
/* loaded from: classes4.dex */
public final class C6545o {

    /* renamed from: a */
    public static final C6545o f8377a = new C6545o();

    /* renamed from: b */
    public static final Map f8378b = new LinkedHashMap();

    /* renamed from: c */
    public static final Map f8379c = new LinkedHashMap();

    /* renamed from: d */
    public static final int f8380d = 8;

    /* renamed from: a */
    public final String m7403a(String address) throws IOException {
        Intrinsics.checkNotNullParameter(address, "address");
        Map map = f8379c;
        if (map.isEmpty()) {
            m7404b();
        }
        String str = (String) map.get(address);
        return str == null ? "" : str;
    }

    /* renamed from: b */
    // RE: 无表头天气 CSV 用第 10 列的中文市名作键，第 1 列是地点 ID。
    // 原包 394 行命中包含匹配，后出现的同名项覆盖前值，最终有 389 个键。
    public final void m7404b() throws IOException {
        try {
            InputStream inputStreamOpen = App.INSTANCE.m5206a().getAssets().open("China-City-List-latest.csv");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return;
                }
                Intrinsics.checkNotNull(line);
                List listSplit$default = StringsKt.split$default((CharSequence) line, new String[]{","}, false, 0, 6, (Object) null);
                if (listSplit$default.size() > 9) {
                    String str = (String) listSplit$default.get(9);
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) listSplit$default.get(2), false, 2, (Object) null)) {
                        f8379c.put(str, listSplit$default.get(0));
                    }
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }
}
