package p000a.p022f.p028c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p022f.p023a.p024a.C0138a;
import p000a.p022f.p028c.C0176f;

/* renamed from: a.f.c.e */
/* loaded from: classes.dex */
public class C0175e {

    /* renamed from: d */
    public static final int[] f1258d = {0, 4, 8};

    /* renamed from: e */
    public static SparseIntArray f1259e;

    /* renamed from: a */
    public HashMap<String, C0172b> f1260a = new HashMap<>();

    /* renamed from: b */
    public boolean f1261b = true;

    /* renamed from: c */
    public HashMap<Integer, a> f1262c = new HashMap<>();

    /* renamed from: a.f.c.e$a */
    public static class a {

        /* renamed from: a */
        public int f1263a;

        /* renamed from: b */
        public final d f1264b = new d();

        /* renamed from: c */
        public final c f1265c = new c();

        /* renamed from: d */
        public final b f1266d = new b();

        /* renamed from: e */
        public final e f1267e = new e();

        /* renamed from: f */
        public HashMap<String, C0172b> f1268f = new HashMap<>();

        /* renamed from: a */
        public void m674a(ConstraintLayout.C0499a c0499a) {
            b bVar = this.f1266d;
            c0499a.f3047d = bVar.f1310h;
            c0499a.f3049e = bVar.f1312i;
            c0499a.f3051f = bVar.f1314j;
            c0499a.f3053g = bVar.f1316k;
            c0499a.f3055h = bVar.f1317l;
            c0499a.f3057i = bVar.f1318m;
            c0499a.f3059j = bVar.f1319n;
            c0499a.f3061k = bVar.f1320o;
            c0499a.f3063l = bVar.f1321p;
            c0499a.f3068p = bVar.f1322q;
            c0499a.f3069q = bVar.f1323r;
            c0499a.f3070r = bVar.f1324s;
            c0499a.f3071s = bVar.f1325t;
            ((ViewGroup.MarginLayoutParams) c0499a).leftMargin = bVar.f1273D;
            ((ViewGroup.MarginLayoutParams) c0499a).rightMargin = bVar.f1274E;
            ((ViewGroup.MarginLayoutParams) c0499a).topMargin = bVar.f1275F;
            ((ViewGroup.MarginLayoutParams) c0499a).bottomMargin = bVar.f1276G;
            c0499a.f3076x = bVar.f1284O;
            c0499a.f3077y = bVar.f1283N;
            c0499a.f3073u = bVar.f1280K;
            c0499a.f3075w = bVar.f1282M;
            c0499a.f3078z = bVar.f1326u;
            c0499a.f3015A = bVar.f1327v;
            c0499a.f3065m = bVar.f1329x;
            c0499a.f3066n = bVar.f1330y;
            b bVar2 = this.f1266d;
            c0499a.f3067o = bVar2.f1331z;
            c0499a.f3016B = bVar2.f1328w;
            c0499a.f3030P = bVar2.f1270A;
            c0499a.f3031Q = bVar2.f1271B;
            c0499a.f3019E = bVar2.f1285P;
            c0499a.f3018D = bVar2.f1286Q;
            c0499a.f3021G = bVar2.f1288S;
            c0499a.f3020F = bVar2.f1287R;
            c0499a.f3033S = bVar2.f1311h0;
            c0499a.f3034T = bVar2.f1313i0;
            c0499a.f3022H = bVar2.f1289T;
            c0499a.f3023I = bVar2.f1290U;
            c0499a.f3026L = bVar2.f1291V;
            c0499a.f3027M = bVar2.f1292W;
            c0499a.f3024J = bVar2.f1293X;
            c0499a.f3025K = bVar2.f1294Y;
            c0499a.f3028N = bVar2.f1295Z;
            c0499a.f3029O = bVar2.f1297a0;
            c0499a.f3032R = bVar2.f1272C;
            c0499a.f3045c = bVar2.f1308g;
            c0499a.f3041a = bVar2.f1304e;
            c0499a.f3043b = bVar2.f1306f;
            ((ViewGroup.MarginLayoutParams) c0499a).width = bVar2.f1300c;
            ((ViewGroup.MarginLayoutParams) c0499a).height = bVar2.f1302d;
            String str = bVar2.f1309g0;
            if (str != null) {
                c0499a.f3035U = str;
            }
            c0499a.setMarginStart(this.f1266d.f1278I);
            c0499a.setMarginEnd(this.f1266d.f1277H);
            c0499a.m1642a();
        }

        /* renamed from: b */
        public final void m675b(int i, ConstraintLayout.C0499a c0499a) {
            this.f1263a = i;
            b bVar = this.f1266d;
            bVar.f1310h = c0499a.f3047d;
            bVar.f1312i = c0499a.f3049e;
            bVar.f1314j = c0499a.f3051f;
            bVar.f1316k = c0499a.f3053g;
            bVar.f1317l = c0499a.f3055h;
            bVar.f1318m = c0499a.f3057i;
            bVar.f1319n = c0499a.f3059j;
            bVar.f1320o = c0499a.f3061k;
            bVar.f1321p = c0499a.f3063l;
            bVar.f1322q = c0499a.f3068p;
            bVar.f1323r = c0499a.f3069q;
            bVar.f1324s = c0499a.f3070r;
            bVar.f1325t = c0499a.f3071s;
            bVar.f1326u = c0499a.f3078z;
            bVar.f1327v = c0499a.f3015A;
            bVar.f1328w = c0499a.f3016B;
            bVar.f1329x = c0499a.f3065m;
            bVar.f1330y = c0499a.f3066n;
            bVar.f1331z = c0499a.f3067o;
            bVar.f1270A = c0499a.f3030P;
            bVar.f1271B = c0499a.f3031Q;
            bVar.f1272C = c0499a.f3032R;
            bVar.f1308g = c0499a.f3045c;
            bVar.f1304e = c0499a.f3041a;
            bVar.f1306f = c0499a.f3043b;
            b bVar2 = this.f1266d;
            bVar2.f1300c = ((ViewGroup.MarginLayoutParams) c0499a).width;
            bVar2.f1302d = ((ViewGroup.MarginLayoutParams) c0499a).height;
            bVar2.f1273D = ((ViewGroup.MarginLayoutParams) c0499a).leftMargin;
            bVar2.f1274E = ((ViewGroup.MarginLayoutParams) c0499a).rightMargin;
            bVar2.f1275F = ((ViewGroup.MarginLayoutParams) c0499a).topMargin;
            bVar2.f1276G = ((ViewGroup.MarginLayoutParams) c0499a).bottomMargin;
            bVar2.f1285P = c0499a.f3019E;
            bVar2.f1286Q = c0499a.f3018D;
            bVar2.f1288S = c0499a.f3021G;
            bVar2.f1287R = c0499a.f3020F;
            bVar2.f1311h0 = c0499a.f3033S;
            bVar2.f1313i0 = c0499a.f3034T;
            bVar2.f1289T = c0499a.f3022H;
            bVar2.f1290U = c0499a.f3023I;
            bVar2.f1291V = c0499a.f3026L;
            bVar2.f1292W = c0499a.f3027M;
            bVar2.f1293X = c0499a.f3024J;
            bVar2.f1294Y = c0499a.f3025K;
            bVar2.f1295Z = c0499a.f3028N;
            bVar2.f1297a0 = c0499a.f3029O;
            bVar2.f1309g0 = c0499a.f3035U;
            bVar2.f1280K = c0499a.f3073u;
            bVar2.f1282M = c0499a.f3075w;
            bVar2.f1279J = c0499a.f3072t;
            bVar2.f1281L = c0499a.f3074v;
            b bVar3 = this.f1266d;
            bVar3.f1284O = c0499a.f3076x;
            bVar3.f1283N = c0499a.f3077y;
            bVar3.f1277H = c0499a.getMarginEnd();
            this.f1266d.f1278I = c0499a.getMarginStart();
        }

        /* renamed from: c */
        public final void m676c(int i, C0176f.a aVar) {
            m675b(i, aVar);
            this.f1264b.f1343d = aVar.f1360m0;
            e eVar = this.f1267e;
            eVar.f1347b = aVar.f1363p0;
            eVar.f1348c = aVar.f1364q0;
            eVar.f1349d = aVar.f1365r0;
            eVar.f1350e = aVar.f1366s0;
            eVar.f1351f = aVar.f1367t0;
            eVar.f1352g = aVar.f1368u0;
            eVar.f1353h = aVar.f1369v0;
            eVar.f1354i = aVar.f1370w0;
            eVar.f1355j = aVar.f1371x0;
            eVar.f1356k = aVar.f1372y0;
            eVar.f1358m = aVar.f1362o0;
            eVar.f1357l = aVar.f1361n0;
        }

        public Object clone() {
            a aVar = new a();
            b bVar = aVar.f1266d;
            b bVar2 = this.f1266d;
            Objects.requireNonNull(bVar);
            bVar.f1296a = bVar2.f1296a;
            bVar.f1300c = bVar2.f1300c;
            bVar.f1298b = bVar2.f1298b;
            bVar.f1302d = bVar2.f1302d;
            bVar.f1304e = bVar2.f1304e;
            bVar.f1306f = bVar2.f1306f;
            bVar.f1308g = bVar2.f1308g;
            bVar.f1310h = bVar2.f1310h;
            bVar.f1312i = bVar2.f1312i;
            bVar.f1314j = bVar2.f1314j;
            bVar.f1316k = bVar2.f1316k;
            bVar.f1317l = bVar2.f1317l;
            bVar.f1318m = bVar2.f1318m;
            bVar.f1319n = bVar2.f1319n;
            bVar.f1320o = bVar2.f1320o;
            bVar.f1321p = bVar2.f1321p;
            bVar.f1322q = bVar2.f1322q;
            bVar.f1323r = bVar2.f1323r;
            bVar.f1324s = bVar2.f1324s;
            bVar.f1325t = bVar2.f1325t;
            bVar.f1326u = bVar2.f1326u;
            bVar.f1327v = bVar2.f1327v;
            bVar.f1328w = bVar2.f1328w;
            bVar.f1329x = bVar2.f1329x;
            bVar.f1330y = bVar2.f1330y;
            bVar.f1331z = bVar2.f1331z;
            bVar.f1270A = bVar2.f1270A;
            bVar.f1271B = bVar2.f1271B;
            bVar.f1272C = bVar2.f1272C;
            bVar.f1273D = bVar2.f1273D;
            bVar.f1274E = bVar2.f1274E;
            bVar.f1275F = bVar2.f1275F;
            bVar.f1276G = bVar2.f1276G;
            bVar.f1277H = bVar2.f1277H;
            bVar.f1278I = bVar2.f1278I;
            bVar.f1279J = bVar2.f1279J;
            bVar.f1280K = bVar2.f1280K;
            bVar.f1281L = bVar2.f1281L;
            bVar.f1282M = bVar2.f1282M;
            bVar.f1283N = bVar2.f1283N;
            bVar.f1284O = bVar2.f1284O;
            bVar.f1285P = bVar2.f1285P;
            bVar.f1286Q = bVar2.f1286Q;
            bVar.f1287R = bVar2.f1287R;
            bVar.f1288S = bVar2.f1288S;
            bVar.f1289T = bVar2.f1289T;
            bVar.f1290U = bVar2.f1290U;
            bVar.f1291V = bVar2.f1291V;
            bVar.f1292W = bVar2.f1292W;
            bVar.f1293X = bVar2.f1293X;
            bVar.f1294Y = bVar2.f1294Y;
            bVar.f1295Z = bVar2.f1295Z;
            bVar.f1297a0 = bVar2.f1297a0;
            bVar.f1299b0 = bVar2.f1299b0;
            bVar.f1301c0 = bVar2.f1301c0;
            bVar.f1303d0 = bVar2.f1303d0;
            bVar.f1309g0 = bVar2.f1309g0;
            int[] iArr = bVar2.f1305e0;
            if (iArr != null) {
                bVar.f1305e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.f1305e0 = null;
            }
            bVar.f1307f0 = bVar2.f1307f0;
            bVar.f1311h0 = bVar2.f1311h0;
            bVar.f1313i0 = bVar2.f1313i0;
            bVar.f1315j0 = bVar2.f1315j0;
            c cVar = aVar.f1265c;
            c cVar2 = this.f1265c;
            Objects.requireNonNull(cVar);
            cVar.f1333a = cVar2.f1333a;
            cVar.f1334b = cVar2.f1334b;
            cVar.f1335c = cVar2.f1335c;
            cVar.f1336d = cVar2.f1336d;
            cVar.f1337e = cVar2.f1337e;
            cVar.f1339g = cVar2.f1339g;
            cVar.f1338f = cVar2.f1338f;
            d dVar = aVar.f1264b;
            d dVar2 = this.f1264b;
            Objects.requireNonNull(dVar);
            dVar.f1340a = dVar2.f1340a;
            dVar.f1341b = dVar2.f1341b;
            dVar.f1343d = dVar2.f1343d;
            dVar.f1344e = dVar2.f1344e;
            dVar.f1342c = dVar2.f1342c;
            e eVar = aVar.f1267e;
            e eVar2 = this.f1267e;
            Objects.requireNonNull(eVar);
            eVar.f1346a = eVar2.f1346a;
            eVar.f1347b = eVar2.f1347b;
            eVar.f1348c = eVar2.f1348c;
            eVar.f1349d = eVar2.f1349d;
            eVar.f1350e = eVar2.f1350e;
            eVar.f1351f = eVar2.f1351f;
            eVar.f1352g = eVar2.f1352g;
            eVar.f1353h = eVar2.f1353h;
            eVar.f1354i = eVar2.f1354i;
            eVar.f1355j = eVar2.f1355j;
            eVar.f1356k = eVar2.f1356k;
            eVar.f1357l = eVar2.f1357l;
            eVar.f1358m = eVar2.f1358m;
            aVar.f1263a = this.f1263a;
            return aVar;
        }
    }

    /* renamed from: a.f.c.e$b */
    public static class b {

        /* renamed from: k0 */
        public static SparseIntArray f1269k0;

        /* renamed from: c */
        public int f1300c;

        /* renamed from: d */
        public int f1302d;

        /* renamed from: e0 */
        public int[] f1305e0;

        /* renamed from: f0 */
        public String f1307f0;

        /* renamed from: g0 */
        public String f1309g0;

        /* renamed from: a */
        public boolean f1296a = false;

        /* renamed from: b */
        public boolean f1298b = false;

        /* renamed from: e */
        public int f1304e = -1;

        /* renamed from: f */
        public int f1306f = -1;

        /* renamed from: g */
        public float f1308g = -1.0f;

        /* renamed from: h */
        public int f1310h = -1;

        /* renamed from: i */
        public int f1312i = -1;

        /* renamed from: j */
        public int f1314j = -1;

        /* renamed from: k */
        public int f1316k = -1;

        /* renamed from: l */
        public int f1317l = -1;

        /* renamed from: m */
        public int f1318m = -1;

        /* renamed from: n */
        public int f1319n = -1;

        /* renamed from: o */
        public int f1320o = -1;

        /* renamed from: p */
        public int f1321p = -1;

        /* renamed from: q */
        public int f1322q = -1;

        /* renamed from: r */
        public int f1323r = -1;

        /* renamed from: s */
        public int f1324s = -1;

        /* renamed from: t */
        public int f1325t = -1;

        /* renamed from: u */
        public float f1326u = 0.5f;

        /* renamed from: v */
        public float f1327v = 0.5f;

        /* renamed from: w */
        public String f1328w = null;

        /* renamed from: x */
        public int f1329x = -1;

        /* renamed from: y */
        public int f1330y = 0;

        /* renamed from: z */
        public float f1331z = 0.0f;

        /* renamed from: A */
        public int f1270A = -1;

        /* renamed from: B */
        public int f1271B = -1;

        /* renamed from: C */
        public int f1272C = -1;

        /* renamed from: D */
        public int f1273D = -1;

        /* renamed from: E */
        public int f1274E = -1;

        /* renamed from: F */
        public int f1275F = -1;

        /* renamed from: G */
        public int f1276G = -1;

        /* renamed from: H */
        public int f1277H = -1;

        /* renamed from: I */
        public int f1278I = -1;

        /* renamed from: J */
        public int f1279J = -1;

        /* renamed from: K */
        public int f1280K = -1;

        /* renamed from: L */
        public int f1281L = -1;

        /* renamed from: M */
        public int f1282M = -1;

        /* renamed from: N */
        public int f1283N = -1;

        /* renamed from: O */
        public int f1284O = -1;

        /* renamed from: P */
        public float f1285P = -1.0f;

        /* renamed from: Q */
        public float f1286Q = -1.0f;

        /* renamed from: R */
        public int f1287R = 0;

        /* renamed from: S */
        public int f1288S = 0;

        /* renamed from: T */
        public int f1289T = 0;

        /* renamed from: U */
        public int f1290U = 0;

        /* renamed from: V */
        public int f1291V = -1;

        /* renamed from: W */
        public int f1292W = -1;

        /* renamed from: X */
        public int f1293X = -1;

        /* renamed from: Y */
        public int f1294Y = -1;

        /* renamed from: Z */
        public float f1295Z = 1.0f;

        /* renamed from: a0 */
        public float f1297a0 = 1.0f;

        /* renamed from: b0 */
        public int f1299b0 = -1;

        /* renamed from: c0 */
        public int f1301c0 = 0;

        /* renamed from: d0 */
        public int f1303d0 = -1;

        /* renamed from: h0 */
        public boolean f1311h0 = false;

        /* renamed from: i0 */
        public boolean f1313i0 = false;

        /* renamed from: j0 */
        public boolean f1315j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1269k0 = sparseIntArray;
            sparseIntArray.append(38, 24);
            f1269k0.append(39, 25);
            f1269k0.append(41, 28);
            f1269k0.append(42, 29);
            f1269k0.append(47, 35);
            f1269k0.append(46, 34);
            f1269k0.append(20, 4);
            f1269k0.append(19, 3);
            f1269k0.append(17, 1);
            f1269k0.append(55, 6);
            f1269k0.append(56, 7);
            f1269k0.append(27, 17);
            f1269k0.append(28, 18);
            f1269k0.append(29, 19);
            f1269k0.append(0, 26);
            f1269k0.append(43, 31);
            f1269k0.append(44, 32);
            f1269k0.append(26, 10);
            f1269k0.append(25, 9);
            f1269k0.append(59, 13);
            f1269k0.append(62, 16);
            f1269k0.append(60, 14);
            f1269k0.append(57, 11);
            f1269k0.append(61, 15);
            f1269k0.append(58, 12);
            f1269k0.append(50, 38);
            f1269k0.append(36, 37);
            f1269k0.append(35, 39);
            f1269k0.append(49, 40);
            f1269k0.append(34, 20);
            f1269k0.append(48, 36);
            f1269k0.append(24, 5);
            f1269k0.append(37, 76);
            f1269k0.append(45, 76);
            f1269k0.append(40, 76);
            f1269k0.append(18, 76);
            f1269k0.append(16, 76);
            f1269k0.append(3, 23);
            f1269k0.append(5, 27);
            f1269k0.append(7, 30);
            f1269k0.append(8, 8);
            f1269k0.append(4, 33);
            f1269k0.append(6, 2);
            f1269k0.append(1, 22);
            f1269k0.append(2, 21);
            f1269k0.append(21, 61);
            f1269k0.append(23, 62);
            f1269k0.append(22, 63);
            f1269k0.append(54, 69);
            f1269k0.append(33, 70);
            f1269k0.append(12, 71);
            f1269k0.append(10, 72);
            f1269k0.append(11, 73);
            f1269k0.append(13, 74);
            f1269k0.append(9, 75);
        }

        /* renamed from: a */
        public void m677a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0180j.f1380e);
            this.f1298b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = f1269k0.get(index);
                if (i2 == 80) {
                    this.f1311h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1311h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                            int i3 = this.f1321p;
                            int[] iArr = C0175e.f1258d;
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, i3);
                            if (resourceId == -1) {
                                resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1321p = resourceId;
                            break;
                        case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                            this.f1276G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1276G);
                            break;
                        case 3:
                            int i4 = this.f1320o;
                            int[] iArr2 = C0175e.f1258d;
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, i4);
                            if (resourceId2 == -1) {
                                resourceId2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1320o = resourceId2;
                            break;
                        case 4:
                            int i5 = this.f1319n;
                            int[] iArr3 = C0175e.f1258d;
                            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, i5);
                            if (resourceId3 == -1) {
                                resourceId3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1319n = resourceId3;
                            break;
                        case 5:
                            this.f1328w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f1270A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1270A);
                            break;
                        case 7:
                            this.f1271B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1271B);
                            break;
                        case 8:
                            this.f1277H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1277H);
                            break;
                        case 9:
                            int i6 = this.f1325t;
                            int[] iArr4 = C0175e.f1258d;
                            int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, i6);
                            if (resourceId4 == -1) {
                                resourceId4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1325t = resourceId4;
                            break;
                        case 10:
                            int i7 = this.f1324s;
                            int[] iArr5 = C0175e.f1258d;
                            int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, i7);
                            if (resourceId5 == -1) {
                                resourceId5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1324s = resourceId5;
                            break;
                        case 11:
                            this.f1282M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1282M);
                            break;
                        case 12:
                            this.f1283N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1283N);
                            break;
                        case 13:
                            this.f1279J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1279J);
                            break;
                        case 14:
                            this.f1281L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1281L);
                            break;
                        case 15:
                            this.f1284O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1284O);
                            break;
                        case 16:
                            this.f1280K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1280K);
                            break;
                        case 17:
                            this.f1304e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1304e);
                            break;
                        case 18:
                            this.f1306f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1306f);
                            break;
                        case 19:
                            this.f1308g = typedArrayObtainStyledAttributes.getFloat(index, this.f1308g);
                            break;
                        case 20:
                            this.f1326u = typedArrayObtainStyledAttributes.getFloat(index, this.f1326u);
                            break;
                        case 21:
                            this.f1302d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1302d);
                            break;
                        case 22:
                            this.f1300c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1300c);
                            break;
                        case 23:
                            this.f1273D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1273D);
                            break;
                        case 24:
                            int i8 = this.f1310h;
                            int[] iArr6 = C0175e.f1258d;
                            int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, i8);
                            if (resourceId6 == -1) {
                                resourceId6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1310h = resourceId6;
                            break;
                        case 25:
                            int i9 = this.f1312i;
                            int[] iArr7 = C0175e.f1258d;
                            int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, i9);
                            if (resourceId7 == -1) {
                                resourceId7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1312i = resourceId7;
                            break;
                        case 26:
                            this.f1272C = typedArrayObtainStyledAttributes.getInt(index, this.f1272C);
                            break;
                        case 27:
                            this.f1274E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1274E);
                            break;
                        case 28:
                            int i10 = this.f1314j;
                            int[] iArr8 = C0175e.f1258d;
                            int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, i10);
                            if (resourceId8 == -1) {
                                resourceId8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1314j = resourceId8;
                            break;
                        case 29:
                            int i11 = this.f1316k;
                            int[] iArr9 = C0175e.f1258d;
                            int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, i11);
                            if (resourceId9 == -1) {
                                resourceId9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1316k = resourceId9;
                            break;
                        case 30:
                            this.f1278I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1278I);
                            break;
                        case 31:
                            int i12 = this.f1322q;
                            int[] iArr10 = C0175e.f1258d;
                            int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, i12);
                            if (resourceId10 == -1) {
                                resourceId10 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1322q = resourceId10;
                            break;
                        case BuildConfig.VERSION_CODE /* 32 */:
                            int i13 = this.f1323r;
                            int[] iArr11 = C0175e.f1258d;
                            int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, i13);
                            if (resourceId11 == -1) {
                                resourceId11 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1323r = resourceId11;
                            break;
                        case 33:
                            this.f1275F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1275F);
                            break;
                        case 34:
                            int i14 = this.f1318m;
                            int[] iArr12 = C0175e.f1258d;
                            int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, i14);
                            if (resourceId12 == -1) {
                                resourceId12 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1318m = resourceId12;
                            break;
                        case 35:
                            int i15 = this.f1317l;
                            int[] iArr13 = C0175e.f1258d;
                            int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, i15);
                            if (resourceId13 == -1) {
                                resourceId13 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1317l = resourceId13;
                            break;
                        case 36:
                            this.f1327v = typedArrayObtainStyledAttributes.getFloat(index, this.f1327v);
                            break;
                        case 37:
                            this.f1286Q = typedArrayObtainStyledAttributes.getFloat(index, this.f1286Q);
                            break;
                        case 38:
                            this.f1285P = typedArrayObtainStyledAttributes.getFloat(index, this.f1285P);
                            break;
                        case 39:
                            this.f1287R = typedArrayObtainStyledAttributes.getInt(index, this.f1287R);
                            break;
                        case 40:
                            this.f1288S = typedArrayObtainStyledAttributes.getInt(index, this.f1288S);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f1289T = typedArrayObtainStyledAttributes.getInt(index, this.f1289T);
                                    break;
                                case 55:
                                    this.f1290U = typedArrayObtainStyledAttributes.getInt(index, this.f1290U);
                                    break;
                                case 56:
                                    this.f1291V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1291V);
                                    break;
                                case 57:
                                    this.f1292W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1292W);
                                    break;
                                case 58:
                                    this.f1293X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1293X);
                                    break;
                                case 59:
                                    this.f1294Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1294Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            int i16 = this.f1329x;
                                            int[] iArr14 = C0175e.f1258d;
                                            int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, i16);
                                            if (resourceId14 == -1) {
                                                resourceId14 = typedArrayObtainStyledAttributes.getInt(index, -1);
                                            }
                                            this.f1329x = resourceId14;
                                            break;
                                        case 62:
                                            this.f1330y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1330y);
                                            break;
                                        case 63:
                                            this.f1331z = typedArrayObtainStyledAttributes.getFloat(index, this.f1331z);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f1295Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f1297a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f1299b0 = typedArrayObtainStyledAttributes.getInt(index, this.f1299b0);
                                                    continue;
                                                case 73:
                                                    this.f1301c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1301c0);
                                                    continue;
                                                case 74:
                                                    this.f1307f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f1315j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1315j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f1309g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f1269k0.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f1313i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1313i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a.f.c.e$c */
    public static class c {

        /* renamed from: h */
        public static SparseIntArray f1332h;

        /* renamed from: a */
        public boolean f1333a = false;

        /* renamed from: b */
        public int f1334b = -1;

        /* renamed from: c */
        public String f1335c = null;

        /* renamed from: d */
        public int f1336d = -1;

        /* renamed from: e */
        public int f1337e = 0;

        /* renamed from: f */
        public float f1338f = Float.NaN;

        /* renamed from: g */
        public float f1339g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1332h = sparseIntArray;
            sparseIntArray.append(2, 1);
            f1332h.append(4, 2);
            f1332h.append(5, 3);
            f1332h.append(1, 4);
            f1332h.append(0, 5);
            f1332h.append(3, 6);
        }

        /* renamed from: a */
        public void m678a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0180j.f1381f);
            this.f1333a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f1332h.get(index)) {
                    case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                        this.f1339g = typedArrayObtainStyledAttributes.getFloat(index, this.f1339g);
                        break;
                    case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                        this.f1336d = typedArrayObtainStyledAttributes.getInt(index, this.f1336d);
                        break;
                    case 3:
                        this.f1335c = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : C0138a.f955a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1337e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i2 = this.f1334b;
                        int[] iArr = C0175e.f1258d;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, i2);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1334b = resourceId;
                        break;
                    case 6:
                        this.f1338f = typedArrayObtainStyledAttributes.getFloat(index, this.f1338f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a.f.c.e$d */
    public static class d {

        /* renamed from: a */
        public boolean f1340a = false;

        /* renamed from: b */
        public int f1341b = 0;

        /* renamed from: c */
        public int f1342c = 0;

        /* renamed from: d */
        public float f1343d = 1.0f;

        /* renamed from: e */
        public float f1344e = Float.NaN;

        /* renamed from: a */
        public void m679a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0180j.f1382g);
            this.f1340a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f1343d = typedArrayObtainStyledAttributes.getFloat(index, this.f1343d);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f1341b);
                    this.f1341b = i2;
                    int[] iArr = C0175e.f1258d;
                    this.f1341b = C0175e.f1258d[i2];
                } else if (index == 4) {
                    this.f1342c = typedArrayObtainStyledAttributes.getInt(index, this.f1342c);
                } else if (index == 3) {
                    this.f1344e = typedArrayObtainStyledAttributes.getFloat(index, this.f1344e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a.f.c.e$e */
    public static class e {

        /* renamed from: n */
        public static SparseIntArray f1345n;

        /* renamed from: a */
        public boolean f1346a = false;

        /* renamed from: b */
        public float f1347b = 0.0f;

        /* renamed from: c */
        public float f1348c = 0.0f;

        /* renamed from: d */
        public float f1349d = 0.0f;

        /* renamed from: e */
        public float f1350e = 1.0f;

        /* renamed from: f */
        public float f1351f = 1.0f;

        /* renamed from: g */
        public float f1352g = Float.NaN;

        /* renamed from: h */
        public float f1353h = Float.NaN;

        /* renamed from: i */
        public float f1354i = 0.0f;

        /* renamed from: j */
        public float f1355j = 0.0f;

        /* renamed from: k */
        public float f1356k = 0.0f;

        /* renamed from: l */
        public boolean f1357l = false;

        /* renamed from: m */
        public float f1358m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1345n = sparseIntArray;
            sparseIntArray.append(6, 1);
            f1345n.append(7, 2);
            f1345n.append(8, 3);
            f1345n.append(4, 4);
            f1345n.append(5, 5);
            f1345n.append(0, 6);
            f1345n.append(1, 7);
            f1345n.append(2, 8);
            f1345n.append(3, 9);
            f1345n.append(9, 10);
            f1345n.append(10, 11);
        }

        /* renamed from: a */
        public void m680a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0180j.f1384i);
            this.f1346a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f1345n.get(index)) {
                    case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                        this.f1347b = typedArrayObtainStyledAttributes.getFloat(index, this.f1347b);
                        break;
                    case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                        this.f1348c = typedArrayObtainStyledAttributes.getFloat(index, this.f1348c);
                        break;
                    case 3:
                        this.f1349d = typedArrayObtainStyledAttributes.getFloat(index, this.f1349d);
                        break;
                    case 4:
                        this.f1350e = typedArrayObtainStyledAttributes.getFloat(index, this.f1350e);
                        break;
                    case 5:
                        this.f1351f = typedArrayObtainStyledAttributes.getFloat(index, this.f1351f);
                        break;
                    case 6:
                        this.f1352g = typedArrayObtainStyledAttributes.getDimension(index, this.f1352g);
                        break;
                    case 7:
                        this.f1353h = typedArrayObtainStyledAttributes.getDimension(index, this.f1353h);
                        break;
                    case 8:
                        this.f1354i = typedArrayObtainStyledAttributes.getDimension(index, this.f1354i);
                        break;
                    case 9:
                        this.f1355j = typedArrayObtainStyledAttributes.getDimension(index, this.f1355j);
                        break;
                    case 10:
                        this.f1356k = typedArrayObtainStyledAttributes.getDimension(index, this.f1356k);
                        break;
                    case 11:
                        this.f1357l = true;
                        this.f1358m = typedArrayObtainStyledAttributes.getDimension(index, this.f1358m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1259e = sparseIntArray;
        sparseIntArray.append(76, 25);
        f1259e.append(77, 26);
        f1259e.append(79, 29);
        f1259e.append(80, 30);
        f1259e.append(86, 36);
        f1259e.append(85, 35);
        f1259e.append(58, 4);
        f1259e.append(57, 3);
        f1259e.append(55, 1);
        f1259e.append(94, 6);
        f1259e.append(95, 7);
        f1259e.append(65, 17);
        f1259e.append(66, 18);
        f1259e.append(67, 19);
        f1259e.append(0, 27);
        f1259e.append(81, 32);
        f1259e.append(82, 33);
        f1259e.append(64, 10);
        f1259e.append(63, 9);
        f1259e.append(98, 13);
        f1259e.append(101, 16);
        f1259e.append(99, 14);
        f1259e.append(96, 11);
        f1259e.append(100, 15);
        f1259e.append(97, 12);
        f1259e.append(89, 40);
        f1259e.append(74, 39);
        f1259e.append(73, 41);
        f1259e.append(88, 42);
        f1259e.append(72, 20);
        f1259e.append(87, 37);
        f1259e.append(62, 5);
        f1259e.append(75, 82);
        f1259e.append(84, 82);
        f1259e.append(78, 82);
        f1259e.append(56, 82);
        f1259e.append(54, 82);
        f1259e.append(5, 24);
        f1259e.append(7, 28);
        f1259e.append(23, 31);
        f1259e.append(24, 8);
        f1259e.append(6, 34);
        f1259e.append(8, 2);
        f1259e.append(3, 23);
        f1259e.append(4, 21);
        f1259e.append(2, 22);
        f1259e.append(13, 43);
        f1259e.append(26, 44);
        f1259e.append(21, 45);
        f1259e.append(22, 46);
        f1259e.append(20, 60);
        f1259e.append(18, 47);
        f1259e.append(19, 48);
        f1259e.append(14, 49);
        f1259e.append(15, 50);
        f1259e.append(16, 51);
        f1259e.append(17, 52);
        f1259e.append(25, 53);
        f1259e.append(90, 54);
        f1259e.append(68, 55);
        f1259e.append(91, 56);
        f1259e.append(69, 57);
        f1259e.append(92, 58);
        f1259e.append(70, 59);
        f1259e.append(59, 61);
        f1259e.append(61, 62);
        f1259e.append(60, 63);
        f1259e.append(27, 64);
        f1259e.append(106, 65);
        f1259e.append(33, 66);
        f1259e.append(107, 67);
        f1259e.append(103, 79);
        f1259e.append(1, 38);
        f1259e.append(102, 68);
        f1259e.append(93, 69);
        f1259e.append(71, 70);
        f1259e.append(31, 71);
        f1259e.append(29, 72);
        f1259e.append(30, 73);
        f1259e.append(32, 74);
        f1259e.append(28, 75);
        f1259e.append(104, 76);
        f1259e.append(83, 77);
        f1259e.append(108, 78);
        f1259e.append(53, 80);
        f1259e.append(52, 81);
    }

    /* renamed from: a */
    public void m670a(Context context, int i) {
        C0172b c0172b;
        C0175e c0175e = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout.getChildCount();
        c0175e.f1262c.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.C0499a c0499a = (ConstraintLayout.C0499a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0175e.f1261b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!c0175e.f1262c.containsKey(Integer.valueOf(id))) {
                c0175e.f1262c.put(Integer.valueOf(id), new a());
            }
            a aVar = c0175e.f1262c.get(Integer.valueOf(id));
            HashMap<String, C0172b> map = c0175e.f1260a;
            HashMap<String, C0172b> map2 = new HashMap<>();
            Class<?> cls = childAt.getClass();
            for (String str : map.keySet()) {
                C0172b c0172b2 = map.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        c0172b = new C0172b(c0172b2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                    } else {
                        try {
                            c0172b = new C0172b(c0172b2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            e.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                    }
                    map2.put(str, c0172b);
                } catch (IllegalAccessException e5) {
                    e = e5;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                } catch (InvocationTargetException e7) {
                    e = e7;
                }
            }
            aVar.f1268f = map2;
            aVar.m675b(id, c0499a);
            aVar.f1264b.f1341b = childAt.getVisibility();
            aVar.f1264b.f1343d = childAt.getAlpha();
            aVar.f1267e.f1347b = childAt.getRotation();
            aVar.f1267e.f1348c = childAt.getRotationX();
            aVar.f1267e.f1349d = childAt.getRotationY();
            aVar.f1267e.f1350e = childAt.getScaleX();
            aVar.f1267e.f1351f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f1267e;
                eVar.f1352g = pivotX;
                eVar.f1353h = pivotY;
            }
            aVar.f1267e.f1354i = childAt.getTranslationX();
            aVar.f1267e.f1355j = childAt.getTranslationY();
            aVar.f1267e.f1356k = childAt.getTranslationZ();
            e eVar2 = aVar.f1267e;
            if (eVar2.f1357l) {
                eVar2.f1358m = childAt.getElevation();
            }
            if (childAt instanceof C0171a) {
                C0171a c0171a = (C0171a) childAt;
                b bVar = aVar.f1266d;
                bVar.f1315j0 = c0171a.f1224j.f1033h0;
                bVar.f1305e0 = c0171a.getReferencedIds();
                aVar.f1266d.f1299b0 = c0171a.getType();
                aVar.f1266d.f1301c0 = c0171a.getMargin();
            }
            i2++;
            c0175e = this;
        }
    }

    /* renamed from: b */
    public final int[] m671b(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objM1636c;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = C0179i.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objM1636c = ((ConstraintLayout) view.getParent()).m1636c(0, strTrim)) != null && (objM1636c instanceof Integer)) {
                iIntValue = ((Integer) objM1636c).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* renamed from: c */
    public final a m672c(Context context, AttributeSet attributeSet) {
        c cVar;
        String string;
        StringBuilder sb;
        String str;
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0180j.f1376a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index != 1 && 23 != index && 24 != index) {
                aVar.f1265c.f1333a = true;
                aVar.f1266d.f1298b = true;
                aVar.f1264b.f1340a = true;
                aVar.f1267e.f1346a = true;
            }
            switch (f1259e.get(index)) {
                case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                    b bVar = aVar.f1266d;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, bVar.f1321p);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar.f1321p = resourceId;
                    continue;
                case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                    b bVar2 = aVar.f1266d;
                    bVar2.f1276G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar2.f1276G);
                    continue;
                case 3:
                    b bVar3 = aVar.f1266d;
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, bVar3.f1320o);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar3.f1320o = resourceId2;
                    continue;
                case 4:
                    b bVar4 = aVar.f1266d;
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, bVar4.f1319n);
                    if (resourceId3 == -1) {
                        resourceId3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar4.f1319n = resourceId3;
                    continue;
                case 5:
                    aVar.f1266d.f1328w = typedArrayObtainStyledAttributes.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f1266d;
                    bVar5.f1270A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar5.f1270A);
                    continue;
                case 7:
                    b bVar6 = aVar.f1266d;
                    bVar6.f1271B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar6.f1271B);
                    continue;
                case 8:
                    b bVar7 = aVar.f1266d;
                    bVar7.f1277H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar7.f1277H);
                    continue;
                case 9:
                    b bVar8 = aVar.f1266d;
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, bVar8.f1325t);
                    if (resourceId4 == -1) {
                        resourceId4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar8.f1325t = resourceId4;
                    continue;
                case 10:
                    b bVar9 = aVar.f1266d;
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, bVar9.f1324s);
                    if (resourceId5 == -1) {
                        resourceId5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar9.f1324s = resourceId5;
                    continue;
                case 11:
                    b bVar10 = aVar.f1266d;
                    bVar10.f1282M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar10.f1282M);
                    continue;
                case 12:
                    b bVar11 = aVar.f1266d;
                    bVar11.f1283N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar11.f1283N);
                    continue;
                case 13:
                    b bVar12 = aVar.f1266d;
                    bVar12.f1279J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar12.f1279J);
                    continue;
                case 14:
                    b bVar13 = aVar.f1266d;
                    bVar13.f1281L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar13.f1281L);
                    continue;
                case 15:
                    b bVar14 = aVar.f1266d;
                    bVar14.f1284O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar14.f1284O);
                    continue;
                case 16:
                    b bVar15 = aVar.f1266d;
                    bVar15.f1280K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar15.f1280K);
                    continue;
                case 17:
                    b bVar16 = aVar.f1266d;
                    bVar16.f1304e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f1304e);
                    continue;
                case 18:
                    b bVar17 = aVar.f1266d;
                    bVar17.f1306f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f1306f);
                    continue;
                case 19:
                    b bVar18 = aVar.f1266d;
                    bVar18.f1308g = typedArrayObtainStyledAttributes.getFloat(index, bVar18.f1308g);
                    continue;
                case 20:
                    b bVar19 = aVar.f1266d;
                    bVar19.f1326u = typedArrayObtainStyledAttributes.getFloat(index, bVar19.f1326u);
                    continue;
                case 21:
                    b bVar20 = aVar.f1266d;
                    bVar20.f1302d = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar20.f1302d);
                    continue;
                case 22:
                    d dVar = aVar.f1264b;
                    dVar.f1341b = typedArrayObtainStyledAttributes.getInt(index, dVar.f1341b);
                    d dVar2 = aVar.f1264b;
                    dVar2.f1341b = f1258d[dVar2.f1341b];
                    continue;
                case 23:
                    b bVar21 = aVar.f1266d;
                    bVar21.f1300c = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar21.f1300c);
                    continue;
                case 24:
                    b bVar22 = aVar.f1266d;
                    bVar22.f1273D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar22.f1273D);
                    continue;
                case 25:
                    b bVar23 = aVar.f1266d;
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, bVar23.f1310h);
                    if (resourceId6 == -1) {
                        resourceId6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar23.f1310h = resourceId6;
                    continue;
                case 26:
                    b bVar24 = aVar.f1266d;
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, bVar24.f1312i);
                    if (resourceId7 == -1) {
                        resourceId7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar24.f1312i = resourceId7;
                    continue;
                case 27:
                    b bVar25 = aVar.f1266d;
                    bVar25.f1272C = typedArrayObtainStyledAttributes.getInt(index, bVar25.f1272C);
                    continue;
                case 28:
                    b bVar26 = aVar.f1266d;
                    bVar26.f1274E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar26.f1274E);
                    continue;
                case 29:
                    b bVar27 = aVar.f1266d;
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, bVar27.f1314j);
                    if (resourceId8 == -1) {
                        resourceId8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar27.f1314j = resourceId8;
                    continue;
                case 30:
                    b bVar28 = aVar.f1266d;
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, bVar28.f1316k);
                    if (resourceId9 == -1) {
                        resourceId9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar28.f1316k = resourceId9;
                    continue;
                case 31:
                    b bVar29 = aVar.f1266d;
                    bVar29.f1278I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar29.f1278I);
                    continue;
                case BuildConfig.VERSION_CODE /* 32 */:
                    b bVar30 = aVar.f1266d;
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, bVar30.f1322q);
                    if (resourceId10 == -1) {
                        resourceId10 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar30.f1322q = resourceId10;
                    continue;
                case 33:
                    b bVar31 = aVar.f1266d;
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, bVar31.f1323r);
                    if (resourceId11 == -1) {
                        resourceId11 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar31.f1323r = resourceId11;
                    continue;
                case 34:
                    b bVar32 = aVar.f1266d;
                    bVar32.f1275F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar32.f1275F);
                    continue;
                case 35:
                    b bVar33 = aVar.f1266d;
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, bVar33.f1318m);
                    if (resourceId12 == -1) {
                        resourceId12 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar33.f1318m = resourceId12;
                    continue;
                case 36:
                    b bVar34 = aVar.f1266d;
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, bVar34.f1317l);
                    if (resourceId13 == -1) {
                        resourceId13 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar34.f1317l = resourceId13;
                    continue;
                case 37:
                    b bVar35 = aVar.f1266d;
                    bVar35.f1327v = typedArrayObtainStyledAttributes.getFloat(index, bVar35.f1327v);
                    continue;
                case 38:
                    aVar.f1263a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f1263a);
                    continue;
                case 39:
                    b bVar36 = aVar.f1266d;
                    bVar36.f1286Q = typedArrayObtainStyledAttributes.getFloat(index, bVar36.f1286Q);
                    continue;
                case 40:
                    b bVar37 = aVar.f1266d;
                    bVar37.f1285P = typedArrayObtainStyledAttributes.getFloat(index, bVar37.f1285P);
                    continue;
                case 41:
                    b bVar38 = aVar.f1266d;
                    bVar38.f1287R = typedArrayObtainStyledAttributes.getInt(index, bVar38.f1287R);
                    continue;
                case 42:
                    b bVar39 = aVar.f1266d;
                    bVar39.f1288S = typedArrayObtainStyledAttributes.getInt(index, bVar39.f1288S);
                    continue;
                case 43:
                    d dVar3 = aVar.f1264b;
                    dVar3.f1343d = typedArrayObtainStyledAttributes.getFloat(index, dVar3.f1343d);
                    continue;
                case 44:
                    e eVar = aVar.f1267e;
                    eVar.f1357l = true;
                    eVar.f1358m = typedArrayObtainStyledAttributes.getDimension(index, eVar.f1358m);
                    continue;
                case 45:
                    e eVar2 = aVar.f1267e;
                    eVar2.f1348c = typedArrayObtainStyledAttributes.getFloat(index, eVar2.f1348c);
                    continue;
                case 46:
                    e eVar3 = aVar.f1267e;
                    eVar3.f1349d = typedArrayObtainStyledAttributes.getFloat(index, eVar3.f1349d);
                    continue;
                case 47:
                    e eVar4 = aVar.f1267e;
                    eVar4.f1350e = typedArrayObtainStyledAttributes.getFloat(index, eVar4.f1350e);
                    continue;
                case 48:
                    e eVar5 = aVar.f1267e;
                    eVar5.f1351f = typedArrayObtainStyledAttributes.getFloat(index, eVar5.f1351f);
                    continue;
                case 49:
                    e eVar6 = aVar.f1267e;
                    eVar6.f1352g = typedArrayObtainStyledAttributes.getDimension(index, eVar6.f1352g);
                    continue;
                case 50:
                    e eVar7 = aVar.f1267e;
                    eVar7.f1353h = typedArrayObtainStyledAttributes.getDimension(index, eVar7.f1353h);
                    continue;
                case 51:
                    e eVar8 = aVar.f1267e;
                    eVar8.f1354i = typedArrayObtainStyledAttributes.getDimension(index, eVar8.f1354i);
                    continue;
                case 52:
                    e eVar9 = aVar.f1267e;
                    eVar9.f1355j = typedArrayObtainStyledAttributes.getDimension(index, eVar9.f1355j);
                    continue;
                case 53:
                    e eVar10 = aVar.f1267e;
                    eVar10.f1356k = typedArrayObtainStyledAttributes.getDimension(index, eVar10.f1356k);
                    continue;
                case 54:
                    b bVar40 = aVar.f1266d;
                    bVar40.f1289T = typedArrayObtainStyledAttributes.getInt(index, bVar40.f1289T);
                    continue;
                case 55:
                    b bVar41 = aVar.f1266d;
                    bVar41.f1290U = typedArrayObtainStyledAttributes.getInt(index, bVar41.f1290U);
                    continue;
                case 56:
                    b bVar42 = aVar.f1266d;
                    bVar42.f1291V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar42.f1291V);
                    continue;
                case 57:
                    b bVar43 = aVar.f1266d;
                    bVar43.f1292W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar43.f1292W);
                    continue;
                case 58:
                    b bVar44 = aVar.f1266d;
                    bVar44.f1293X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar44.f1293X);
                    continue;
                case 59:
                    b bVar45 = aVar.f1266d;
                    bVar45.f1294Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar45.f1294Y);
                    continue;
                case 60:
                    e eVar11 = aVar.f1267e;
                    eVar11.f1347b = typedArrayObtainStyledAttributes.getFloat(index, eVar11.f1347b);
                    continue;
                case 61:
                    b bVar46 = aVar.f1266d;
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, bVar46.f1329x);
                    if (resourceId14 == -1) {
                        resourceId14 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar46.f1329x = resourceId14;
                    continue;
                case 62:
                    b bVar47 = aVar.f1266d;
                    bVar47.f1330y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar47.f1330y);
                    continue;
                case 63:
                    b bVar48 = aVar.f1266d;
                    bVar48.f1331z = typedArrayObtainStyledAttributes.getFloat(index, bVar48.f1331z);
                    continue;
                case 64:
                    c cVar2 = aVar.f1265c;
                    int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, cVar2.f1334b);
                    if (resourceId15 == -1) {
                        resourceId15 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    cVar2.f1334b = resourceId15;
                    continue;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        cVar = aVar.f1265c;
                        string = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        cVar = aVar.f1265c;
                        string = C0138a.f955a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    cVar.f1335c = string;
                    continue;
                case 66:
                    aVar.f1265c.f1337e = typedArrayObtainStyledAttributes.getInt(index, 0);
                    continue;
                case 67:
                    c cVar3 = aVar.f1265c;
                    cVar3.f1339g = typedArrayObtainStyledAttributes.getFloat(index, cVar3.f1339g);
                    continue;
                case 68:
                    d dVar4 = aVar.f1264b;
                    dVar4.f1344e = typedArrayObtainStyledAttributes.getFloat(index, dVar4.f1344e);
                    continue;
                case 69:
                    aVar.f1266d.f1295Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f1266d.f1297a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f1266d;
                    bVar49.f1299b0 = typedArrayObtainStyledAttributes.getInt(index, bVar49.f1299b0);
                    continue;
                case 73:
                    b bVar50 = aVar.f1266d;
                    bVar50.f1301c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar50.f1301c0);
                    continue;
                case 74:
                    aVar.f1266d.f1307f0 = typedArrayObtainStyledAttributes.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f1266d;
                    bVar51.f1315j0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar51.f1315j0);
                    continue;
                case 76:
                    c cVar4 = aVar.f1265c;
                    cVar4.f1336d = typedArrayObtainStyledAttributes.getInt(index, cVar4.f1336d);
                    continue;
                case 77:
                    aVar.f1266d.f1309g0 = typedArrayObtainStyledAttributes.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.f1264b;
                    dVar5.f1342c = typedArrayObtainStyledAttributes.getInt(index, dVar5.f1342c);
                    continue;
                case 79:
                    c cVar5 = aVar.f1265c;
                    cVar5.f1338f = typedArrayObtainStyledAttributes.getFloat(index, cVar5.f1338f);
                    continue;
                case 80:
                    b bVar52 = aVar.f1266d;
                    bVar52.f1311h0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar52.f1311h0);
                    continue;
                case 81:
                    b bVar53 = aVar.f1266d;
                    bVar53.f1313i0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar53.f1313i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f1259e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: d */
    public void m673d(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM672c = m672c(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM672c.f1266d.f1296a = true;
                    }
                    this.f1262c.put(Integer.valueOf(aVarM672c.f1263a), aVarM672c);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
