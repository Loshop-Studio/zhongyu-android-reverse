package androidx.constraintlayout.compose;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Registry;
import androidx.constraintlayout.core.state.RegistryCallback;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0011\b!\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0003J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0006\u0010\u0018\u001a\u00020\u0003J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0004J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\nH\u0004J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\nH\u0004J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nJ\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u0003J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0003H\u0016J\u0016\u0010)\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0016J\b\u0010+\u001a\u00020\u001bH\u0004R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m13558d2 = {"Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "content", "", "(Ljava/lang/String;)V", "currentContent", "debugName", "forcedDrawDebug", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "forcedHeight", "", "forcedWidth", "last", "", "layoutInformation", "layoutInformationMode", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "updateFlag", "Landroidx/compose/runtime/MutableState;", "getCurrentContent", "getDebugName", "getForcedDrawDebug", "getForcedHeight", "getForcedWidth", "getLayoutInformation", "getLayoutInformationMode", "initialization", "", "onDrawDebug", "debugMode", "onLayoutInformation", "mode", "onNewContent", "onNewDimensions", "width", "height", "setCurrentContent", "setDebugName", HintConstants.AUTOFILL_HINT_NAME, "setLayoutInformation", "information", "setUpdateFlag", "needsUpdate", "signalUpdate", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@PublishedApi
/* loaded from: classes2.dex */
public abstract class EditableJSONLayout implements LayoutInformationReceiver {
    public static final int $stable = 8;
    private String currentContent;
    private String debugName;
    private MutableState<Long> updateFlag;
    private int forcedWidth = Integer.MIN_VALUE;
    private int forcedHeight = Integer.MIN_VALUE;
    private MotionLayoutDebugFlags forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;
    private LayoutInfoFlags layoutInformationMode = LayoutInfoFlags.NONE;
    private String layoutInformation = "";
    private long last = System.nanoTime();

    public EditableJSONLayout(String str) {
        this.currentContent = str;
    }

    public final String getCurrentContent() {
        return this.currentContent;
    }

    public final String getDebugName() {
        return this.debugName;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public MotionLayoutDebugFlags getForcedDrawDebug() {
        return this.forcedDrawDebug;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedHeight() {
        return this.forcedHeight;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedWidth() {
        return this.forcedWidth;
    }

    public final String getLayoutInformation() {
        return this.layoutInformation;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public LayoutInfoFlags getLayoutInformationMode() {
        return this.layoutInformationMode;
    }

    public final void initialization() {
        try {
            onNewContent(this.currentContent);
            if (this.debugName != null) {
                Registry.getInstance().register(this.debugName, new RegistryCallback() { // from class: androidx.constraintlayout.compose.EditableJSONLayout$initialization$callback$1
                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public String currentLayoutInformation() {
                        return this.this$0.layoutInformation;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public String currentMotionScene() {
                        return this.this$0.currentContent;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public long getLastModified() {
                        return this.this$0.last;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onDimensions(int width, int height) {
                        this.this$0.onNewDimensions(width, height);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onNewMotionScene(String content) {
                        if (content == null) {
                            return;
                        }
                        this.this$0.onNewContent(content);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onProgress(float progress) {
                        this.this$0.onNewProgress(progress);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setDrawDebug(int debugMode) {
                        this.this$0.onDrawDebug(debugMode);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setLayoutInformationMode(int mode) {
                        this.this$0.onLayoutInformation(mode);
                    }
                });
            }
        } catch (CLParsingException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011 A[PHI: r1
      0x0011: PHI (r1v3 androidx.constraintlayout.compose.MotionLayoutDebugFlags) = 
      (r1v1 androidx.constraintlayout.compose.MotionLayoutDebugFlags)
      (r1v2 androidx.constraintlayout.compose.MotionLayoutDebugFlags)
     binds: [B:6:0x000f, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDrawDebug(int r4) {
        /*
            r3 = this;
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r0 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.UNKNOWN
            int r1 = r0.ordinal()
            if (r4 != r1) goto L9
            goto L1c
        L9:
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r1 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE
            int r2 = r1.ordinal()
            if (r4 != r2) goto L13
        L11:
            r0 = r1
            goto L1c
        L13:
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r1 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.SHOW_ALL
            int r2 = r1.ordinal()
            if (r4 != r2) goto L1c
            goto L11
        L1c:
            r3.forcedDrawDebug = r0
            r3.signalUpdate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.EditableJSONLayout.onDrawDebug(int):void");
    }

    public final void onLayoutInformation(int mode) {
        LayoutInfoFlags layoutInfoFlags = LayoutInfoFlags.NONE;
        if (mode == layoutInfoFlags.ordinal()) {
            this.layoutInformationMode = layoutInfoFlags;
        } else {
            LayoutInfoFlags layoutInfoFlags2 = LayoutInfoFlags.BOUNDS;
            if (mode == layoutInfoFlags2.ordinal()) {
                this.layoutInformationMode = layoutInfoFlags2;
            }
        }
        signalUpdate();
    }

    public void onNewContent(String content) {
        CLObject objectOrNull;
        this.currentContent = content;
        try {
            CLObject cLObject = CLParser.parse(content);
            if (cLObject != null) {
                boolean z9 = this.debugName == null;
                if (z9 && (objectOrNull = cLObject.getObjectOrNull("Header")) != null) {
                    this.debugName = objectOrNull.getStringOrNull("exportAs");
                    this.layoutInformationMode = LayoutInfoFlags.BOUNDS;
                }
                if (z9) {
                    return;
                }
                signalUpdate();
            }
        } catch (CLParsingException | Exception unused) {
        }
    }

    public final void onNewDimensions(int width, int height) {
        this.forcedWidth = width;
        this.forcedHeight = height;
        signalUpdate();
    }

    public final void setCurrentContent(String content) {
        onNewContent(content);
    }

    public final void setDebugName(String name) {
        this.debugName = name;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setLayoutInformation(String information) {
        this.last = System.nanoTime();
        this.layoutInformation = information;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setUpdateFlag(MutableState<Long> needsUpdate) {
        this.updateFlag = needsUpdate;
    }

    public final void signalUpdate() {
        MutableState<Long> mutableState = this.updateFlag;
        if (mutableState != null) {
            Intrinsics.checkNotNull(mutableState);
            MutableState<Long> mutableState2 = this.updateFlag;
            Intrinsics.checkNotNull(mutableState2);
            mutableState.setValue(Long.valueOf(mutableState2.getValue().longValue() + 1));
        }
    }
}
