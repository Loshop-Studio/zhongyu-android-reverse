package p072h3;

import com.xuexiang.xui.widget.popupwindow.ViewTooltip$ALIGN;
import com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position;

/* renamed from: h3.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5621a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8754a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f8755b;

    static {
        int[] iArr = new int[ViewTooltip$ALIGN.values().length];
        f8755b = iArr;
        try {
            iArr[ViewTooltip$ALIGN.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8755b[ViewTooltip$ALIGN.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[ViewTooltip$Position.values().length];
        f8754a = iArr2;
        try {
            iArr2[ViewTooltip$Position.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f8754a[ViewTooltip$Position.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f8754a[ViewTooltip$Position.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f8754a[ViewTooltip$Position.RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
