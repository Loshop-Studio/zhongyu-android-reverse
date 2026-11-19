package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class Chain extends Helper {
    protected static final Map<Style, String> styleMap;
    private Style mStyle;
    protected ArrayList<Ref> references;

    public class Anchor {
        Constraint.Anchor mConnection = null;
        int mGoneMargin = Integer.MIN_VALUE;
        int mMargin;
        final Constraint.Side mSide;

        public Anchor(Constraint.Side side) {
            this.mSide = side;
        }

        public void build(StringBuilder sb2) {
            if (this.mConnection != null) {
                sb2.append(this.mSide.toString().toLowerCase());
                sb2.append(":");
                sb2.append(this);
                sb2.append(",\n");
            }
        }

        public String getId() {
            return Chain.this.name;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            if (this.mConnection != null) {
                sb2.append("'");
                sb2.append(this.mConnection.getId());
                sb2.append("',");
                sb2.append("'");
                sb2.append(this.mConnection.mSide.toString().toLowerCase());
                sb2.append("'");
            }
            if (this.mMargin != 0) {
                sb2.append(",");
                sb2.append(this.mMargin);
            }
            if (this.mGoneMargin != Integer.MIN_VALUE) {
                if (this.mMargin == 0) {
                    sb2.append(",0,");
                    sb2.append(this.mGoneMargin);
                } else {
                    sb2.append(",");
                    sb2.append(this.mGoneMargin);
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public enum Style {
        PACKED,
        SPREAD,
        SPREAD_INSIDE
    }

    static {
        HashMap map = new HashMap();
        styleMap = map;
        map.put(Style.SPREAD, "'spread'");
        map.put(Style.SPREAD_INSIDE, "'spread_inside'");
        map.put(Style.PACKED, "'packed'");
    }

    public Chain(String str) {
        super(str, new Helper.HelperType(""));
        this.mStyle = null;
        this.references = new ArrayList<>();
    }

    public Chain addReference(Ref ref) {
        this.references.add(ref);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    public Style getStyle() {
        return this.mStyle;
    }

    public String referencesToString() {
        if (this.references.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("[");
        ArrayList<Ref> arrayList = this.references;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Ref ref = arrayList.get(i10);
            i10++;
            sb2.append(ref.toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void setStyle(Style style) {
        this.mStyle = style;
        this.configMap.put("style", styleMap.get(style));
    }

    public Chain addReference(String str) {
        return addReference(Ref.parseStringToRef(str));
    }
}
