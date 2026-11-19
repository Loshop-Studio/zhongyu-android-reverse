package androidx.compose.p006ui.text.input;

import androidx.compose.p006ui.text.ExperimentalTextApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@ExperimentalTextApi
@Metadata(m5174d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m5175d2 = {"Landroidx/compose/ui/text/input/TextInputForTests;", "", "inputTextForTest", "", "text", "", "submitTextForTest", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface TextInputForTests {
    void inputTextForTest(String text);

    @ExperimentalTextApi
    void submitTextForTest();
}
