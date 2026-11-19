package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class KeyParser {

    public interface DataType {
        int get(int i9);
    }

    public interface Ids {
        int get(String str);
    }

    public static void main(String[] strArr) {
        parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static TypedBundle parse(String str, Ids ids, DataType dataType) {
        TypedBundle typedBundle = new TypedBundle();
        try {
            CLObject cLObject = CLParser.parse(str);
            int size = cLObject.size();
            for (int i9 = 0; i9 < size; i9++) {
                CLKey cLKey = (CLKey) cLObject.get(i9);
                String strContent = cLKey.content();
                CLElement value = cLKey.getValue();
                int i10 = ids.get(strContent);
                if (i10 == -1) {
                    System.err.println("unknown type " + strContent);
                } else {
                    int i11 = dataType.get(i10);
                    if (i11 == 1) {
                        typedBundle.add(i10, cLObject.getBoolean(i9));
                    } else if (i11 == 2) {
                        typedBundle.add(i10, value.getInt());
                        System.out.println("parse " + strContent + " INT_MASK > " + value.getInt());
                    } else if (i11 == 4) {
                        typedBundle.add(i10, value.getFloat());
                        System.out.println("parse " + strContent + " FLOAT_MASK > " + value.getFloat());
                    } else if (i11 == 8) {
                        typedBundle.add(i10, value.content());
                        System.out.println("parse " + strContent + " STRING_MASK > " + value.content());
                    }
                }
            }
            return typedBundle;
        } catch (CLParsingException e10) {
            System.err.println(e10.toString() + AbsSection.SEP_ORIGIN_LINE_BREAK + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
            return typedBundle;
        }
    }

    public static TypedBundle parseAttributes(String str) {
        return parse(str, new Ids() { // from class: androidx.constraintlayout.core.motion.parse.a
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.Ids
            public final int get(String str2) {
                return TypedValues.AttributesType.getId(str2);
            }
        }, new DataType() { // from class: androidx.constraintlayout.core.motion.parse.b
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.DataType
            public final int get(int i9) {
                return TypedValues.AttributesType.getType(i9);
            }
        });
    }
}
