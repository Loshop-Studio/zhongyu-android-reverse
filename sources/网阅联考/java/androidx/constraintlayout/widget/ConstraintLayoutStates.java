package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private final ConstraintLayout mConstraintLayout;
    ConstraintSet mDefaultConstraintSet;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    public static class State {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.mConstraintID = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1765R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C1765R.styleable.State_android_id) {
                    this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == C1765R.styleable.State_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f4, float f5) {
            for (int i4 = 0; i4 < this.mVariants.size(); i4++) {
                if (this.mVariants.get(i4).match(f4, f5)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    public static class Variant {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1765R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C1765R.styleable.Variant_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                } else if (index == C1765R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == C1765R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == C1765R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == C1765R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMinWidth);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean match(float f4, float f5) {
            if (!Float.isNaN(this.mMinWidth) && f4 < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && f5 < this.mMinHeight) {
                return false;
            }
            if (Float.isNaN(this.mMaxWidth) || f4 <= this.mMaxWidth) {
                return Float.isNaN(this.mMaxHeight) || f5 <= this.mMaxHeight;
            }
            return false;
        }
    }

    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i4) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.mConstraintLayout = constraintLayout;
        load(context, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void load(android.content.Context r8, int r9) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto L9f
            if (r0 == 0) goto L8d
            r3 = 2
            if (r0 == r3) goto L17
            goto L90
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L4d;
                case 80204913: goto L43;
                case 1382829617: goto L39;
                case 1657696882: goto L2f;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
        L24:
            goto L57
        L25:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            if (r4 == 0) goto L57
            r4 = r6
            goto L58
        L2f:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            if (r4 == 0) goto L57
            r4 = 0
            goto L58
        L39:
            java.lang.String r4 = "StateSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            if (r4 == 0) goto L57
            r4 = r2
            goto L58
        L43:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            if (r4 == 0) goto L57
            r4 = r3
            goto L58
        L4d:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            if (r4 == 0) goto L57
            r4 = r5
            goto L58
        L57:
            r4 = -1
        L58:
            if (r4 == 0) goto L90
            if (r4 == r2) goto L90
            if (r4 == r3) goto L80
            if (r4 == r6) goto L75
            if (r4 == r5) goto L71
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            r2.<init>()     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            java.lang.String r3 = "unknown tag "
            r2.append(r3)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            r2.append(r0)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            goto L90
        L71:
            r7.parseConstraintSet(r8, r9)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            goto L90
        L75:
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r0 = new androidx.constraintlayout.widget.ConstraintLayoutStates$Variant     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            if (r1 == 0) goto L90
            r1.add(r0)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            goto L90
        L80:
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r1 = new androidx.constraintlayout.widget.ConstraintLayoutStates$State     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r0 = r7.mStateList     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            int r2 = r1.mId     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            r0.put(r2, r1)     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            goto L90
        L8d:
            r9.getName()     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
        L90:
            int r0 = r9.next()     // Catch: java.io.IOException -> L96 org.xmlpull.v1.XmlPullParserException -> L9b
            goto Ld
        L96:
            r8 = move-exception
            r8.printStackTrace()
            goto L9f
        L9b:
            r8 = move-exception
            r8.printStackTrace()
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayoutStates.load(android.content.Context, int):void");
    }

    private void parseConstraintSet(Context context, XmlPullParser xmlPullParser) throws NumberFormatException {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            if ("id".equals(xmlPullParser.getAttributeName(i4))) {
                String attributeValue = xmlPullParser.getAttributeValue(i4);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.load(context, xmlPullParser);
                this.mConstraintSetMap.put(identifier, constraintSet);
                return;
            }
        }
    }

    public boolean needsToChange(int i4, float f4, float f5) {
        int i5 = this.mCurrentStateId;
        if (i5 != i4) {
            return true;
        }
        State stateValueAt = i4 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i5);
        int i6 = this.mCurrentConstraintNumber;
        return (i6 == -1 || !stateValueAt.mVariants.get(i6).match(f4, f5)) && this.mCurrentConstraintNumber != stateValueAt.findMatch(f4, f5);
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public void updateConstraints(int i4, float f4, float f5) {
        int iFindMatch;
        int i5 = this.mCurrentStateId;
        if (i5 == i4) {
            State stateValueAt = i4 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i5);
            int i6 = this.mCurrentConstraintNumber;
            if ((i6 == -1 || !stateValueAt.mVariants.get(i6).match(f4, f5)) && this.mCurrentConstraintNumber != (iFindMatch = stateValueAt.findMatch(f4, f5))) {
                ConstraintSet constraintSet = iFindMatch == -1 ? this.mDefaultConstraintSet : stateValueAt.mVariants.get(iFindMatch).mConstraintSet;
                int i7 = iFindMatch == -1 ? stateValueAt.mConstraintID : stateValueAt.mVariants.get(iFindMatch).mConstraintID;
                if (constraintSet == null) {
                    return;
                }
                this.mCurrentConstraintNumber = iFindMatch;
                ConstraintsChangedListener constraintsChangedListener = this.mConstraintsChangedListener;
                if (constraintsChangedListener != null) {
                    constraintsChangedListener.preLayoutChange(-1, i7);
                }
                constraintSet.applyTo(this.mConstraintLayout);
                ConstraintsChangedListener constraintsChangedListener2 = this.mConstraintsChangedListener;
                if (constraintsChangedListener2 != null) {
                    constraintsChangedListener2.postLayoutChange(-1, i7);
                    return;
                }
                return;
            }
            return;
        }
        this.mCurrentStateId = i4;
        State state = this.mStateList.get(i4);
        int iFindMatch2 = state.findMatch(f4, f5);
        ConstraintSet constraintSet2 = iFindMatch2 == -1 ? state.mConstraintSet : state.mVariants.get(iFindMatch2).mConstraintSet;
        int i8 = iFindMatch2 == -1 ? state.mConstraintID : state.mVariants.get(iFindMatch2).mConstraintID;
        if (constraintSet2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("NO Constraint set found ! id=");
            sb.append(i4);
            sb.append(", dim =");
            sb.append(f4);
            sb.append(", ");
            sb.append(f5);
            return;
        }
        this.mCurrentConstraintNumber = iFindMatch2;
        ConstraintsChangedListener constraintsChangedListener3 = this.mConstraintsChangedListener;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(i4, i8);
        }
        constraintSet2.applyTo(this.mConstraintLayout);
        ConstraintsChangedListener constraintsChangedListener4 = this.mConstraintsChangedListener;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(i4, i8);
        }
    }
}
