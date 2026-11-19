package p148s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: s.b */
/* loaded from: classes.dex */
public final class C3364b {

    /* renamed from: a */
    private final Shader f11811a;

    /* renamed from: b */
    private final ColorStateList f11812b;

    /* renamed from: c */
    private int f11813c;

    private C3364b(Shader shader, ColorStateList colorStateList, int i4) {
        this.f11811a = shader;
        this.f11812b = colorStateList;
        this.f11813c = i4;
    }

    /* renamed from: a */
    private static C3364b m10192a(Resources resources, int i4, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i4);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return m10195d(C3366d.m10224b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m10194c(C3363a.m10185b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* renamed from: b */
    static C3364b m10193b(int i4) {
        return new C3364b(null, null, i4);
    }

    /* renamed from: c */
    static C3364b m10194c(ColorStateList colorStateList) {
        return new C3364b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C3364b m10195d(Shader shader) {
        return new C3364b(shader, null, 0);
    }

    /* renamed from: g */
    public static C3364b m10196g(Resources resources, int i4, Resources.Theme theme) {
        try {
            return m10192a(resources, i4, theme);
        } catch (Exception e4) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
            return null;
        }
    }

    /* renamed from: e */
    public int m10197e() {
        return this.f11813c;
    }

    /* renamed from: f */
    public Shader m10198f() {
        return this.f11811a;
    }

    /* renamed from: h */
    public boolean m10199h() {
        return this.f11811a != null;
    }

    /* renamed from: i */
    public boolean m10200i() {
        ColorStateList colorStateList;
        return this.f11811a == null && (colorStateList = this.f11812b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m10201j(int[] iArr) {
        if (m10200i()) {
            ColorStateList colorStateList = this.f11812b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f11813c) {
                this.f11813c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m10202k(int i4) {
        this.f11813c = i4;
    }

    /* renamed from: l */
    public boolean m10203l() {
        return m10199h() || this.f11813c != 0;
    }
}
