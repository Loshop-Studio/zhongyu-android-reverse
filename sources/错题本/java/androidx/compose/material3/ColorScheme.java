package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B§\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(Bñ\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b'\u0010)Jø\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+J´\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b5\u00104R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b6\u00104R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b7\u00104R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b8\u00104R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b9\u00104R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b:\u00104R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b;\u00104R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b<\u00104R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b=\u00104R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b>\u00104R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b?\u00104R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b@\u00104R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\bA\u00104R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\bB\u00104R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\bC\u00104R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\bD\u00104R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\bE\u00104R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\bF\u00104R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\bG\u00104R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\bH\u00104R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\bI\u00104R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\bJ\u00104R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\bK\u00104R\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\bL\u00104R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\bM\u00104R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\bN\u00104R\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\bO\u00104R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\bP\u00104R\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bQ\u00104R\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\bR\u00104R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\bS\u00104R\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\bT\u00104R\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\bU\u00104R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\bV\u00104R\u001d\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\bW\u00104R$\u0010Y\u001a\u0004\u0018\u00010X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010_\u001a\u0004\u0018\u00010X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010\\\"\u0004\ba\u0010^R$\u0010b\u001a\u0004\u0018\u00010X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010Z\u001a\u0004\bc\u0010\\\"\u0004\bd\u0010^R$\u0010e\u001a\u0004\u0018\u00010X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010Z\u001a\u0004\bf\u0010\\\"\u0004\bg\u0010^R$\u0010h\u001a\u0004\u0018\u00010X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010Z\u001a\u0004\bi\u0010\\\"\u0004\bj\u0010^R$\u0010l\u001a\u0004\u0018\u00010k8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010r\u001a\u0004\u0018\u00010k8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010m\u001a\u0004\bs\u0010o\"\u0004\bt\u0010qR$\u0010u\u001a\u0004\u0018\u00010k8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010m\u001a\u0004\bv\u0010o\"\u0004\bw\u0010qR$\u0010y\u001a\u0004\u0018\u00010x8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u007f\u001a\u0004\u0018\u00010x8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010z\u001a\u0005\b\u0080\u0001\u0010|\"\u0005\b\u0081\u0001\u0010~R(\u0010\u0082\u0001\u001a\u0004\u0018\u00010x8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010z\u001a\u0005\b\u0083\u0001\u0010|\"\u0005\b\u0084\u0001\u0010~R(\u0010\u0085\u0001\u001a\u0004\u0018\u00010x8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010z\u001a\u0005\b\u0086\u0001\u0010|\"\u0005\b\u0087\u0001\u0010~R,\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R,\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u008a\u0001\u001a\u0006\b\u0090\u0001\u0010\u008c\u0001\"\u0006\b\u0091\u0001\u0010\u008e\u0001R,\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u008a\u0001\u001a\u0006\b\u0093\u0001\u0010\u008c\u0001\"\u0006\b\u0094\u0001\u0010\u008e\u0001R4\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b\u0096\u0001\u0010\u0097\u0001\u0012\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R4\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b\u009e\u0001\u0010\u0097\u0001\u0012\u0006\b¡\u0001\u0010\u009d\u0001\u001a\u0006\b\u009f\u0001\u0010\u0099\u0001\"\u0006\b \u0001\u0010\u009b\u0001R4\u0010¢\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b¢\u0001\u0010\u0097\u0001\u0012\u0006\b¥\u0001\u0010\u009d\u0001\u001a\u0006\b£\u0001\u0010\u0099\u0001\"\u0006\b¤\u0001\u0010\u009b\u0001R4\u0010¦\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b¦\u0001\u0010\u0097\u0001\u0012\u0006\b©\u0001\u0010\u009d\u0001\u001a\u0006\b§\u0001\u0010\u0099\u0001\"\u0006\b¨\u0001\u0010\u009b\u0001R,\u0010«\u0001\u001a\u0005\u0018\u00010ª\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R4\u0010²\u0001\u001a\u0005\u0018\u00010±\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b²\u0001\u0010³\u0001\u0012\u0006\b¸\u0001\u0010\u009d\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R,\u0010º\u0001\u001a\u0005\u0018\u00010¹\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R,\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R,\u0010Ç\u0001\u001a\u0005\u0018\u00010¹\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010»\u0001\u001a\u0006\bÈ\u0001\u0010½\u0001\"\u0006\bÉ\u0001\u0010¿\u0001R,\u0010Ê\u0001\u001a\u0005\u0018\u00010À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Â\u0001\u001a\u0006\bË\u0001\u0010Ä\u0001\"\u0006\bÌ\u0001\u0010Æ\u0001R,\u0010Í\u0001\u001a\u0005\u0018\u00010¹\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010»\u0001\u001a\u0006\bÎ\u0001\u0010½\u0001\"\u0006\bÏ\u0001\u0010¿\u0001R,\u0010Ð\u0001\u001a\u0005\u0018\u00010À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Â\u0001\u001a\u0006\bÑ\u0001\u0010Ä\u0001\"\u0006\bÒ\u0001\u0010Æ\u0001R,\u0010Ó\u0001\u001a\u0005\u0018\u00010¹\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÓ\u0001\u0010»\u0001\u001a\u0006\bÔ\u0001\u0010½\u0001\"\u0006\bÕ\u0001\u0010¿\u0001R,\u0010Ö\u0001\u001a\u0005\u0018\u00010À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÖ\u0001\u0010Â\u0001\u001a\u0006\b×\u0001\u0010Ä\u0001\"\u0006\bØ\u0001\u0010Æ\u0001R,\u0010Ú\u0001\u001a\u0005\u0018\u00010Ù\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R,\u0010á\u0001\u001a\u0005\u0018\u00010à\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R,\u0010è\u0001\u001a\u0005\u0018\u00010ç\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R,\u0010ï\u0001\u001a\u0005\u0018\u00010î\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R,\u0010ö\u0001\u001a\u0005\u0018\u00010õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R4\u0010ý\u0001\u001a\u0005\u0018\u00010ü\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\bý\u0001\u0010þ\u0001\u0012\u0006\b\u0083\u0002\u0010\u009d\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R,\u0010\u0085\u0002\u001a\u0005\u0018\u00010\u0084\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R,\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u008b\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0002\u0010\u008d\u0002\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002\"\u0006\b\u0090\u0002\u0010\u0091\u0002R,\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u0092\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010\u0094\u0002\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002\"\u0006\b\u0097\u0002\u0010\u0098\u0002R,\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0092\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0099\u0002\u0010\u0094\u0002\u001a\u0006\b\u009a\u0002\u0010\u0096\u0002\"\u0006\b\u009b\u0002\u0010\u0098\u0002R4\u0010\u009d\u0002\u001a\u0005\u0018\u00010\u009c\u00028\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b\u009d\u0002\u0010\u009e\u0002\u0012\u0006\b£\u0002\u0010\u009d\u0001\u001a\u0006\b\u009f\u0002\u0010 \u0002\"\u0006\b¡\u0002\u0010¢\u0002R4\u0010¥\u0002\u001a\u0005\u0018\u00010¤\u00028\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b¥\u0002\u0010¦\u0002\u0012\u0006\b«\u0002\u0010\u009d\u0001\u001a\u0006\b§\u0002\u0010¨\u0002\"\u0006\b©\u0002\u0010ª\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¬\u0002"}, m5110d2 = {"Landroidx/compose/material3/ColorScheme;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/e;)V", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/e;)V", "copy-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "copy", "copy-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "", "toString", "()Ljava/lang/String;", "J", "getPrimary-0d7_KjU", "()J", "getOnPrimary-0d7_KjU", "getPrimaryContainer-0d7_KjU", "getOnPrimaryContainer-0d7_KjU", "getInversePrimary-0d7_KjU", "getSecondary-0d7_KjU", "getOnSecondary-0d7_KjU", "getSecondaryContainer-0d7_KjU", "getOnSecondaryContainer-0d7_KjU", "getTertiary-0d7_KjU", "getOnTertiary-0d7_KjU", "getTertiaryContainer-0d7_KjU", "getOnTertiaryContainer-0d7_KjU", "getBackground-0d7_KjU", "getOnBackground-0d7_KjU", "getSurface-0d7_KjU", "getOnSurface-0d7_KjU", "getSurfaceVariant-0d7_KjU", "getOnSurfaceVariant-0d7_KjU", "getSurfaceTint-0d7_KjU", "getInverseSurface-0d7_KjU", "getInverseOnSurface-0d7_KjU", "getError-0d7_KjU", "getOnError-0d7_KjU", "getErrorContainer-0d7_KjU", "getOnErrorContainer-0d7_KjU", "getOutline-0d7_KjU", "getOutlineVariant-0d7_KjU", "getScrim-0d7_KjU", "getSurfaceBright-0d7_KjU", "getSurfaceDim-0d7_KjU", "getSurfaceContainer-0d7_KjU", "getSurfaceContainerHigh-0d7_KjU", "getSurfaceContainerHighest-0d7_KjU", "getSurfaceContainerLow-0d7_KjU", "getSurfaceContainerLowest-0d7_KjU", "Landroidx/compose/material3/ButtonColors;", "defaultButtonColorsCached", "Landroidx/compose/material3/ButtonColors;", "getDefaultButtonColorsCached$material3_release", "()Landroidx/compose/material3/ButtonColors;", "setDefaultButtonColorsCached$material3_release", "(Landroidx/compose/material3/ButtonColors;)V", "defaultElevatedButtonColorsCached", "getDefaultElevatedButtonColorsCached$material3_release", "setDefaultElevatedButtonColorsCached$material3_release", "defaultFilledTonalButtonColorsCached", "getDefaultFilledTonalButtonColorsCached$material3_release", "setDefaultFilledTonalButtonColorsCached$material3_release", "defaultOutlinedButtonColorsCached", "getDefaultOutlinedButtonColorsCached$material3_release", "setDefaultOutlinedButtonColorsCached$material3_release", "defaultTextButtonColorsCached", "getDefaultTextButtonColorsCached$material3_release", "setDefaultTextButtonColorsCached$material3_release", "Landroidx/compose/material3/CardColors;", "defaultCardColorsCached", "Landroidx/compose/material3/CardColors;", "getDefaultCardColorsCached$material3_release", "()Landroidx/compose/material3/CardColors;", "setDefaultCardColorsCached$material3_release", "(Landroidx/compose/material3/CardColors;)V", "defaultElevatedCardColorsCached", "getDefaultElevatedCardColorsCached$material3_release", "setDefaultElevatedCardColorsCached$material3_release", "defaultOutlinedCardColorsCached", "getDefaultOutlinedCardColorsCached$material3_release", "setDefaultOutlinedCardColorsCached$material3_release", "Landroidx/compose/material3/ChipColors;", "defaultAssistChipColorsCached", "Landroidx/compose/material3/ChipColors;", "getDefaultAssistChipColorsCached$material3_release", "()Landroidx/compose/material3/ChipColors;", "setDefaultAssistChipColorsCached$material3_release", "(Landroidx/compose/material3/ChipColors;)V", "defaultElevatedAssistChipColorsCached", "getDefaultElevatedAssistChipColorsCached$material3_release", "setDefaultElevatedAssistChipColorsCached$material3_release", "defaultSuggestionChipColorsCached", "getDefaultSuggestionChipColorsCached$material3_release", "setDefaultSuggestionChipColorsCached$material3_release", "defaultElevatedSuggestionChipColorsCached", "getDefaultElevatedSuggestionChipColorsCached$material3_release", "setDefaultElevatedSuggestionChipColorsCached$material3_release", "Landroidx/compose/material3/SelectableChipColors;", "defaultFilterChipColorsCached", "Landroidx/compose/material3/SelectableChipColors;", "getDefaultFilterChipColorsCached$material3_release", "()Landroidx/compose/material3/SelectableChipColors;", "setDefaultFilterChipColorsCached$material3_release", "(Landroidx/compose/material3/SelectableChipColors;)V", "defaultElevatedFilterChipColorsCached", "getDefaultElevatedFilterChipColorsCached$material3_release", "setDefaultElevatedFilterChipColorsCached$material3_release", "defaultInputChipColorsCached", "getDefaultInputChipColorsCached$material3_release", "setDefaultInputChipColorsCached$material3_release", "Landroidx/compose/material3/TopAppBarColors;", "defaultTopAppBarColorsCached", "Landroidx/compose/material3/TopAppBarColors;", "getDefaultTopAppBarColorsCached$material3_release", "()Landroidx/compose/material3/TopAppBarColors;", "setDefaultTopAppBarColorsCached$material3_release", "(Landroidx/compose/material3/TopAppBarColors;)V", "getDefaultTopAppBarColorsCached$material3_release$annotations", "()V", "defaultCenterAlignedTopAppBarColorsCached", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release", "setDefaultCenterAlignedTopAppBarColorsCached$material3_release", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations", "defaultMediumTopAppBarColorsCached", "getDefaultMediumTopAppBarColorsCached$material3_release", "setDefaultMediumTopAppBarColorsCached$material3_release", "getDefaultMediumTopAppBarColorsCached$material3_release$annotations", "defaultLargeTopAppBarColorsCached", "getDefaultLargeTopAppBarColorsCached$material3_release", "setDefaultLargeTopAppBarColorsCached$material3_release", "getDefaultLargeTopAppBarColorsCached$material3_release$annotations", "Landroidx/compose/material3/CheckboxColors;", "defaultCheckboxColorsCached", "Landroidx/compose/material3/CheckboxColors;", "getDefaultCheckboxColorsCached$material3_release", "()Landroidx/compose/material3/CheckboxColors;", "setDefaultCheckboxColorsCached$material3_release", "(Landroidx/compose/material3/CheckboxColors;)V", "Landroidx/compose/material3/DatePickerColors;", "defaultDatePickerColorsCached", "Landroidx/compose/material3/DatePickerColors;", "getDefaultDatePickerColorsCached$material3_release", "()Landroidx/compose/material3/DatePickerColors;", "setDefaultDatePickerColorsCached$material3_release", "(Landroidx/compose/material3/DatePickerColors;)V", "getDefaultDatePickerColorsCached$material3_release$annotations", "Landroidx/compose/material3/IconButtonColors;", "defaultIconButtonColorsCached", "Landroidx/compose/material3/IconButtonColors;", "getDefaultIconButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconButtonColors;", "setDefaultIconButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconButtonColors;)V", "Landroidx/compose/material3/IconToggleButtonColors;", "defaultIconToggleButtonColorsCached", "Landroidx/compose/material3/IconToggleButtonColors;", "getDefaultIconToggleButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconToggleButtonColors;", "setDefaultIconToggleButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconToggleButtonColors;)V", "defaultFilledIconButtonColorsCached", "getDefaultFilledIconButtonColorsCached$material3_release", "setDefaultFilledIconButtonColorsCached$material3_release", "defaultFilledIconToggleButtonColorsCached", "getDefaultFilledIconToggleButtonColorsCached$material3_release", "setDefaultFilledIconToggleButtonColorsCached$material3_release", "defaultFilledTonalIconButtonColorsCached", "getDefaultFilledTonalIconButtonColorsCached$material3_release", "setDefaultFilledTonalIconButtonColorsCached$material3_release", "defaultFilledTonalIconToggleButtonColorsCached", "getDefaultFilledTonalIconToggleButtonColorsCached$material3_release", "setDefaultFilledTonalIconToggleButtonColorsCached$material3_release", "defaultOutlinedIconButtonColorsCached", "getDefaultOutlinedIconButtonColorsCached$material3_release", "setDefaultOutlinedIconButtonColorsCached$material3_release", "defaultOutlinedIconToggleButtonColorsCached", "getDefaultOutlinedIconToggleButtonColorsCached$material3_release", "setDefaultOutlinedIconToggleButtonColorsCached$material3_release", "Landroidx/compose/material3/MenuItemColors;", "defaultMenuItemColorsCached", "Landroidx/compose/material3/MenuItemColors;", "getDefaultMenuItemColorsCached$material3_release", "()Landroidx/compose/material3/MenuItemColors;", "setDefaultMenuItemColorsCached$material3_release", "(Landroidx/compose/material3/MenuItemColors;)V", "Landroidx/compose/material3/NavigationBarItemColors;", "defaultNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationBarItemColors;", "getDefaultNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationBarItemColors;", "setDefaultNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationBarItemColors;)V", "Landroidx/compose/material3/NavigationRailItemColors;", "defaultNavigationRailItemColorsCached", "Landroidx/compose/material3/NavigationRailItemColors;", "getDefaultNavigationRailItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationRailItemColors;", "setDefaultNavigationRailItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationRailItemColors;)V", "Landroidx/compose/material3/NavigationItemColors;", "defaultExpressiveNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationItemColors;", "getDefaultExpressiveNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationItemColors;", "setDefaultExpressiveNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationItemColors;)V", "Landroidx/compose/material3/RadioButtonColors;", "defaultRadioButtonColorsCached", "Landroidx/compose/material3/RadioButtonColors;", "getDefaultRadioButtonColorsCached$material3_release", "()Landroidx/compose/material3/RadioButtonColors;", "setDefaultRadioButtonColorsCached$material3_release", "(Landroidx/compose/material3/RadioButtonColors;)V", "Landroidx/compose/material3/SegmentedButtonColors;", "defaultSegmentedButtonColorsCached", "Landroidx/compose/material3/SegmentedButtonColors;", "getDefaultSegmentedButtonColorsCached$material3_release", "()Landroidx/compose/material3/SegmentedButtonColors;", "setDefaultSegmentedButtonColorsCached$material3_release", "(Landroidx/compose/material3/SegmentedButtonColors;)V", "getDefaultSegmentedButtonColorsCached$material3_release$annotations", "Landroidx/compose/material3/SliderColors;", "defaultSliderColorsCached", "Landroidx/compose/material3/SliderColors;", "getDefaultSliderColorsCached$material3_release", "()Landroidx/compose/material3/SliderColors;", "setDefaultSliderColorsCached$material3_release", "(Landroidx/compose/material3/SliderColors;)V", "Landroidx/compose/material3/SwitchColors;", "defaultSwitchColorsCached", "Landroidx/compose/material3/SwitchColors;", "getDefaultSwitchColorsCached$material3_release", "()Landroidx/compose/material3/SwitchColors;", "setDefaultSwitchColorsCached$material3_release", "(Landroidx/compose/material3/SwitchColors;)V", "Landroidx/compose/material3/TextFieldColors;", "defaultOutlinedTextFieldColorsCached", "Landroidx/compose/material3/TextFieldColors;", "getDefaultOutlinedTextFieldColorsCached$material3_release", "()Landroidx/compose/material3/TextFieldColors;", "setDefaultOutlinedTextFieldColorsCached$material3_release", "(Landroidx/compose/material3/TextFieldColors;)V", "defaultTextFieldColorsCached", "getDefaultTextFieldColorsCached$material3_release", "setDefaultTextFieldColorsCached$material3_release", "Landroidx/compose/material3/TimePickerColors;", "defaultTimePickerColorsCached", "Landroidx/compose/material3/TimePickerColors;", "getDefaultTimePickerColorsCached$material3_release", "()Landroidx/compose/material3/TimePickerColors;", "setDefaultTimePickerColorsCached$material3_release", "(Landroidx/compose/material3/TimePickerColors;)V", "getDefaultTimePickerColorsCached$material3_release$annotations", "Landroidx/compose/material3/RichTooltipColors;", "defaultRichTooltipColorsCached", "Landroidx/compose/material3/RichTooltipColors;", "getDefaultRichTooltipColorsCached$material3_release", "()Landroidx/compose/material3/RichTooltipColors;", "setDefaultRichTooltipColorsCached$material3_release", "(Landroidx/compose/material3/RichTooltipColors;)V", "getDefaultRichTooltipColorsCached$material3_release$annotations", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ColorScheme {
    public static final int $stable = 0;
    private final long background;

    @Nullable
    private ChipColors defaultAssistChipColorsCached;

    @Nullable
    private ButtonColors defaultButtonColorsCached;

    @Nullable
    private CardColors defaultCardColorsCached;

    @Nullable
    private TopAppBarColors defaultCenterAlignedTopAppBarColorsCached;

    @Nullable
    private CheckboxColors defaultCheckboxColorsCached;

    @Nullable
    private DatePickerColors defaultDatePickerColorsCached;

    @Nullable
    private ChipColors defaultElevatedAssistChipColorsCached;

    @Nullable
    private ButtonColors defaultElevatedButtonColorsCached;

    @Nullable
    private CardColors defaultElevatedCardColorsCached;

    @Nullable
    private SelectableChipColors defaultElevatedFilterChipColorsCached;

    @Nullable
    private ChipColors defaultElevatedSuggestionChipColorsCached;

    @Nullable
    private NavigationItemColors defaultExpressiveNavigationBarItemColorsCached;

    @Nullable
    private IconButtonColors defaultFilledIconButtonColorsCached;

    @Nullable
    private IconToggleButtonColors defaultFilledIconToggleButtonColorsCached;

    @Nullable
    private ButtonColors defaultFilledTonalButtonColorsCached;

    @Nullable
    private IconButtonColors defaultFilledTonalIconButtonColorsCached;

    @Nullable
    private IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached;

    @Nullable
    private SelectableChipColors defaultFilterChipColorsCached;

    @Nullable
    private IconButtonColors defaultIconButtonColorsCached;

    @Nullable
    private IconToggleButtonColors defaultIconToggleButtonColorsCached;

    @Nullable
    private SelectableChipColors defaultInputChipColorsCached;

    @Nullable
    private TopAppBarColors defaultLargeTopAppBarColorsCached;

    @Nullable
    private TopAppBarColors defaultMediumTopAppBarColorsCached;

    @Nullable
    private MenuItemColors defaultMenuItemColorsCached;

    @Nullable
    private NavigationBarItemColors defaultNavigationBarItemColorsCached;

    @Nullable
    private NavigationRailItemColors defaultNavigationRailItemColorsCached;

    @Nullable
    private ButtonColors defaultOutlinedButtonColorsCached;

    @Nullable
    private CardColors defaultOutlinedCardColorsCached;

    @Nullable
    private IconButtonColors defaultOutlinedIconButtonColorsCached;

    @Nullable
    private IconToggleButtonColors defaultOutlinedIconToggleButtonColorsCached;

    @Nullable
    private TextFieldColors defaultOutlinedTextFieldColorsCached;

    @Nullable
    private RadioButtonColors defaultRadioButtonColorsCached;

    @Nullable
    private RichTooltipColors defaultRichTooltipColorsCached;

    @Nullable
    private SegmentedButtonColors defaultSegmentedButtonColorsCached;

    @Nullable
    private SliderColors defaultSliderColorsCached;

    @Nullable
    private ChipColors defaultSuggestionChipColorsCached;

    @Nullable
    private SwitchColors defaultSwitchColorsCached;

    @Nullable
    private ButtonColors defaultTextButtonColorsCached;

    @Nullable
    private TextFieldColors defaultTextFieldColorsCached;

    @Nullable
    private TimePickerColors defaultTimePickerColorsCached;

    @Nullable
    private TopAppBarColors defaultTopAppBarColorsCached;
    private final long error;
    private final long errorContainer;
    private final long inverseOnSurface;
    private final long inversePrimary;
    private final long inverseSurface;
    private final long onBackground;
    private final long onError;
    private final long onErrorContainer;
    private final long onPrimary;
    private final long onPrimaryContainer;
    private final long onSecondary;
    private final long onSecondaryContainer;
    private final long onSurface;
    private final long onSurfaceVariant;
    private final long onTertiary;
    private final long onTertiaryContainer;
    private final long outline;
    private final long outlineVariant;
    private final long primary;
    private final long primaryContainer;
    private final long scrim;
    private final long secondary;
    private final long secondaryContainer;
    private final long surface;
    private final long surfaceBright;
    private final long surfaceContainer;
    private final long surfaceContainerHigh;
    private final long surfaceContainerHighest;
    private final long surfaceContainerLow;
    private final long surfaceContainerLowest;
    private final long surfaceDim;
    private final long surfaceTint;
    private final long surfaceVariant;
    private final long tertiary;
    private final long tertiaryContainer;

    public /* synthetic */ ColorScheme(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42);
    }

    /* renamed from: copy-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m8274copyCXl9yA$default(ColorScheme colorScheme, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, int i, int i8, Object obj) {
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        long j67;
        long j68;
        long j69;
        long j70;
        long j71;
        long j72;
        ColorScheme colorScheme2;
        long j73;
        long j74;
        long j75;
        long j76;
        long j77;
        long j78 = (i & 1) != 0 ? colorScheme.primary : j7;
        long j79 = (i & 2) != 0 ? colorScheme.onPrimary : j8;
        long j80 = (i & 4) != 0 ? colorScheme.primaryContainer : j9;
        long j81 = (i & 8) != 0 ? colorScheme.onPrimaryContainer : j10;
        long j82 = (i & 16) != 0 ? colorScheme.inversePrimary : j11;
        long j83 = (i & 32) != 0 ? colorScheme.secondary : j12;
        long j84 = (i & 64) != 0 ? colorScheme.onSecondary : j13;
        long j85 = j78;
        long j86 = (i & 128) != 0 ? colorScheme.secondaryContainer : j14;
        long j87 = (i & 256) != 0 ? colorScheme.onSecondaryContainer : j15;
        long j88 = (i & 512) != 0 ? colorScheme.tertiary : j16;
        long j89 = (i & 1024) != 0 ? colorScheme.onTertiary : j17;
        long j90 = (i & 2048) != 0 ? colorScheme.tertiaryContainer : j18;
        long j91 = (i & 4096) != 0 ? colorScheme.onTertiaryContainer : j19;
        long j92 = (i & 8192) != 0 ? colorScheme.background : j20;
        long j93 = (i & 16384) != 0 ? colorScheme.onBackground : j21;
        long j94 = (i & 32768) != 0 ? colorScheme.surface : j22;
        long j95 = (i & 65536) != 0 ? colorScheme.onSurface : j23;
        long j96 = (i & 131072) != 0 ? colorScheme.surfaceVariant : j24;
        long j97 = (i & 262144) != 0 ? colorScheme.onSurfaceVariant : j25;
        long j98 = (i & 524288) != 0 ? colorScheme.surfaceTint : j26;
        long j99 = (i & 1048576) != 0 ? colorScheme.inverseSurface : j27;
        long j100 = (i & 2097152) != 0 ? colorScheme.inverseOnSurface : j28;
        long j101 = (i & 4194304) != 0 ? colorScheme.error : j29;
        long j102 = (i & 8388608) != 0 ? colorScheme.onError : j30;
        long j103 = (i & 16777216) != 0 ? colorScheme.errorContainer : j31;
        long j104 = (i & 33554432) != 0 ? colorScheme.onErrorContainer : j32;
        long j105 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? colorScheme.outline : j33;
        long j106 = (i & 134217728) != 0 ? colorScheme.outlineVariant : j34;
        long j107 = (i & 268435456) != 0 ? colorScheme.scrim : j35;
        long j108 = (i & 536870912) != 0 ? colorScheme.surfaceBright : j36;
        long j109 = (i & BasicMeasure.EXACTLY) != 0 ? colorScheme.surfaceDim : j37;
        long j110 = (i & Integer.MIN_VALUE) != 0 ? colorScheme.surfaceContainer : j38;
        long j111 = (i8 & 1) != 0 ? colorScheme.surfaceContainerHigh : j39;
        long j112 = (i8 & 2) != 0 ? colorScheme.surfaceContainerHighest : j40;
        long j113 = (i8 & 4) != 0 ? colorScheme.surfaceContainerLow : j41;
        if ((i8 & 8) != 0) {
            j44 = j113;
            j43 = colorScheme.surfaceContainerLowest;
            j46 = j107;
            j47 = j108;
            j48 = j109;
            j49 = j110;
            j50 = j111;
            j51 = j112;
            j53 = j100;
            j54 = j101;
            j55 = j102;
            j56 = j103;
            j57 = j104;
            j58 = j105;
            j45 = j106;
            j60 = j93;
            j61 = j94;
            j62 = j95;
            j63 = j96;
            j64 = j97;
            j65 = j98;
            j52 = j99;
            j67 = j86;
            j68 = j87;
            j69 = j88;
            j70 = j89;
            j71 = j90;
            j72 = j91;
            j59 = j92;
            colorScheme2 = colorScheme;
            j73 = j79;
            j74 = j80;
            j75 = j81;
            j76 = j82;
            j77 = j83;
            j66 = j84;
        } else {
            j43 = j42;
            j44 = j113;
            j45 = j106;
            j46 = j107;
            j47 = j108;
            j48 = j109;
            j49 = j110;
            j50 = j111;
            j51 = j112;
            j52 = j99;
            j53 = j100;
            j54 = j101;
            j55 = j102;
            j56 = j103;
            j57 = j104;
            j58 = j105;
            j59 = j92;
            j60 = j93;
            j61 = j94;
            j62 = j95;
            j63 = j96;
            j64 = j97;
            j65 = j98;
            j66 = j84;
            j67 = j86;
            j68 = j87;
            j69 = j88;
            j70 = j89;
            j71 = j90;
            j72 = j91;
            colorScheme2 = colorScheme;
            j73 = j79;
            j74 = j80;
            j75 = j81;
            j76 = j82;
            j77 = j83;
        }
        return colorScheme2.m8276copyCXl9yA(j85, j73, j74, j75, j76, j77, j66, j67, j68, j69, j70, j71, j72, j59, j60, j61, j62, j63, j64, j65, j52, j53, j54, j55, j56, j57, j58, j45, j46, j47, j48, j49, j50, j51, j44, j43);
    }

    /* renamed from: copy-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m8275copyG1PFcw$default(ColorScheme colorScheme, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, int i, Object obj) {
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        ColorScheme colorScheme2;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64 = (i & 1) != 0 ? colorScheme.primary : j7;
        long j65 = (i & 2) != 0 ? colorScheme.onPrimary : j8;
        long j66 = (i & 4) != 0 ? colorScheme.primaryContainer : j9;
        long j67 = (i & 8) != 0 ? colorScheme.onPrimaryContainer : j10;
        long j68 = (i & 16) != 0 ? colorScheme.inversePrimary : j11;
        long j69 = (i & 32) != 0 ? colorScheme.secondary : j12;
        long j70 = (i & 64) != 0 ? colorScheme.onSecondary : j13;
        long j71 = j64;
        long j72 = (i & 128) != 0 ? colorScheme.secondaryContainer : j14;
        long j73 = (i & 256) != 0 ? colorScheme.onSecondaryContainer : j15;
        long j74 = (i & 512) != 0 ? colorScheme.tertiary : j16;
        long j75 = (i & 1024) != 0 ? colorScheme.onTertiary : j17;
        long j76 = (i & 2048) != 0 ? colorScheme.tertiaryContainer : j18;
        long j77 = (i & 4096) != 0 ? colorScheme.onTertiaryContainer : j19;
        long j78 = (i & 8192) != 0 ? colorScheme.background : j20;
        long j79 = (i & 16384) != 0 ? colorScheme.onBackground : j21;
        long j80 = (i & 32768) != 0 ? colorScheme.surface : j22;
        long j81 = (i & 65536) != 0 ? colorScheme.onSurface : j23;
        long j82 = (i & 131072) != 0 ? colorScheme.surfaceVariant : j24;
        long j83 = (i & 262144) != 0 ? colorScheme.onSurfaceVariant : j25;
        long j84 = (i & 524288) != 0 ? colorScheme.surfaceTint : j26;
        long j85 = (i & 1048576) != 0 ? colorScheme.inverseSurface : j27;
        long j86 = (i & 2097152) != 0 ? colorScheme.inverseOnSurface : j28;
        long j87 = (i & 4194304) != 0 ? colorScheme.error : j29;
        long j88 = (i & 8388608) != 0 ? colorScheme.onError : j30;
        long j89 = (i & 16777216) != 0 ? colorScheme.errorContainer : j31;
        long j90 = (i & 33554432) != 0 ? colorScheme.onErrorContainer : j32;
        long j91 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? colorScheme.outline : j33;
        long j92 = (i & 134217728) != 0 ? colorScheme.outlineVariant : j34;
        if ((i & 268435456) != 0) {
            j37 = j92;
            j36 = colorScheme.scrim;
            j39 = j86;
            j40 = j87;
            j41 = j88;
            j42 = j89;
            j43 = j90;
            j44 = j91;
            j46 = j79;
            j47 = j80;
            j48 = j81;
            j49 = j82;
            j50 = j83;
            j51 = j84;
            j38 = j85;
            j53 = j72;
            j54 = j73;
            j55 = j74;
            j56 = j75;
            j57 = j76;
            j58 = j77;
            j45 = j78;
            colorScheme2 = colorScheme;
            j59 = j65;
            j60 = j66;
            j61 = j67;
            j62 = j68;
            j63 = j69;
            j52 = j70;
        } else {
            j36 = j35;
            j37 = j92;
            j38 = j85;
            j39 = j86;
            j40 = j87;
            j41 = j88;
            j42 = j89;
            j43 = j90;
            j44 = j91;
            j45 = j78;
            j46 = j79;
            j47 = j80;
            j48 = j81;
            j49 = j82;
            j50 = j83;
            j51 = j84;
            j52 = j70;
            j53 = j72;
            j54 = j73;
            j55 = j74;
            j56 = j75;
            j57 = j76;
            j58 = j77;
            colorScheme2 = colorScheme;
            j59 = j65;
            j60 = j66;
            j61 = j67;
            j62 = j68;
            j63 = j69;
        }
        return colorScheme2.m8277copyG1PFcw(j71, j59, j60, j61, j62, j63, j52, j53, j54, j55, j56, j57, j58, j45, j46, j47, j48, j49, j50, j51, j38, j39, j40, j41, j42, j43, j44, j37, j36);
    }

    /* renamed from: getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations */
    public static /* synthetic */ void m1024x47b39765() {
    }

    public static /* synthetic */ void getDefaultDatePickerColorsCached$material3_release$annotations() {
    }

    /* renamed from: getDefaultLargeTopAppBarColorsCached$material3_release$annotations */
    public static /* synthetic */ void m1025xb8636ff9() {
    }

    /* renamed from: getDefaultMediumTopAppBarColorsCached$material3_release$annotations */
    public static /* synthetic */ void m1026xe7680889() {
    }

    public static /* synthetic */ void getDefaultRichTooltipColorsCached$material3_release$annotations() {
    }

    /* renamed from: getDefaultSegmentedButtonColorsCached$material3_release$annotations */
    public static /* synthetic */ void m1027xc0225afb() {
    }

    public static /* synthetic */ void getDefaultTimePickerColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultTopAppBarColorsCached$material3_release$annotations() {
    }

    @NotNull
    /* renamed from: copy-C-Xl9yA, reason: not valid java name */
    public final ColorScheme m8276copyCXl9yA(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim, long surfaceBright, long surfaceDim, long surfaceContainer, long surfaceContainerHigh, long surfaceContainerHighest, long surfaceContainerLow, long surfaceContainerLowest) {
        return new ColorScheme(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, surfaceBright, surfaceDim, surfaceContainer, surfaceContainerHigh, surfaceContainerHighest, surfaceContainerLow, surfaceContainerLowest, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: copy-G1PFc-w, reason: not valid java name */
    public final /* synthetic */ ColorScheme m8277copyG1PFcw(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim) {
        return m8274copyCXl9yA$default(this, primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    @Nullable
    /* renamed from: getDefaultAssistChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultAssistChipColorsCached() {
        return this.defaultAssistChipColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultButtonColorsCached() {
        return this.defaultButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultCardColorsCached() {
        return this.defaultCardColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultCenterAlignedTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColorsCached() {
        return this.defaultCenterAlignedTopAppBarColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultCheckboxColorsCached$material3_release, reason: from getter */
    public final CheckboxColors getDefaultCheckboxColorsCached() {
        return this.defaultCheckboxColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultDatePickerColorsCached$material3_release, reason: from getter */
    public final DatePickerColors getDefaultDatePickerColorsCached() {
        return this.defaultDatePickerColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultElevatedAssistChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultElevatedAssistChipColorsCached() {
        return this.defaultElevatedAssistChipColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultElevatedButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultElevatedButtonColorsCached() {
        return this.defaultElevatedButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultElevatedCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultElevatedCardColorsCached() {
        return this.defaultElevatedCardColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultElevatedFilterChipColorsCached$material3_release, reason: from getter */
    public final SelectableChipColors getDefaultElevatedFilterChipColorsCached() {
        return this.defaultElevatedFilterChipColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultElevatedSuggestionChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultElevatedSuggestionChipColorsCached() {
        return this.defaultElevatedSuggestionChipColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultExpressiveNavigationBarItemColorsCached$material3_release, reason: from getter */
    public final NavigationItemColors getDefaultExpressiveNavigationBarItemColorsCached() {
        return this.defaultExpressiveNavigationBarItemColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultFilledIconButtonColorsCached$material3_release, reason: from getter */
    public final IconButtonColors getDefaultFilledIconButtonColorsCached() {
        return this.defaultFilledIconButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultFilledIconToggleButtonColorsCached$material3_release, reason: from getter */
    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColorsCached() {
        return this.defaultFilledIconToggleButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultFilledTonalButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultFilledTonalButtonColorsCached() {
        return this.defaultFilledTonalButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultFilledTonalIconButtonColorsCached$material3_release, reason: from getter */
    public final IconButtonColors getDefaultFilledTonalIconButtonColorsCached() {
        return this.defaultFilledTonalIconButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultFilledTonalIconToggleButtonColorsCached$material3_release, reason: from getter */
    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColorsCached() {
        return this.defaultFilledTonalIconToggleButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultFilterChipColorsCached$material3_release, reason: from getter */
    public final SelectableChipColors getDefaultFilterChipColorsCached() {
        return this.defaultFilterChipColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultIconButtonColorsCached$material3_release, reason: from getter */
    public final IconButtonColors getDefaultIconButtonColorsCached() {
        return this.defaultIconButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultIconToggleButtonColorsCached$material3_release, reason: from getter */
    public final IconToggleButtonColors getDefaultIconToggleButtonColorsCached() {
        return this.defaultIconToggleButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultInputChipColorsCached$material3_release, reason: from getter */
    public final SelectableChipColors getDefaultInputChipColorsCached() {
        return this.defaultInputChipColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultLargeTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultLargeTopAppBarColorsCached() {
        return this.defaultLargeTopAppBarColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultMediumTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultMediumTopAppBarColorsCached() {
        return this.defaultMediumTopAppBarColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultMenuItemColorsCached$material3_release, reason: from getter */
    public final MenuItemColors getDefaultMenuItemColorsCached() {
        return this.defaultMenuItemColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultNavigationBarItemColorsCached$material3_release, reason: from getter */
    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached() {
        return this.defaultNavigationBarItemColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultNavigationRailItemColorsCached$material3_release, reason: from getter */
    public final NavigationRailItemColors getDefaultNavigationRailItemColorsCached() {
        return this.defaultNavigationRailItemColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultOutlinedButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultOutlinedButtonColorsCached() {
        return this.defaultOutlinedButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultOutlinedCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultOutlinedCardColorsCached() {
        return this.defaultOutlinedCardColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultOutlinedIconButtonColorsCached$material3_release, reason: from getter */
    public final IconButtonColors getDefaultOutlinedIconButtonColorsCached() {
        return this.defaultOutlinedIconButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultOutlinedIconToggleButtonColorsCached$material3_release, reason: from getter */
    public final IconToggleButtonColors getDefaultOutlinedIconToggleButtonColorsCached() {
        return this.defaultOutlinedIconToggleButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultOutlinedTextFieldColorsCached$material3_release, reason: from getter */
    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultRadioButtonColorsCached$material3_release, reason: from getter */
    public final RadioButtonColors getDefaultRadioButtonColorsCached() {
        return this.defaultRadioButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultRichTooltipColorsCached$material3_release, reason: from getter */
    public final RichTooltipColors getDefaultRichTooltipColorsCached() {
        return this.defaultRichTooltipColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultSegmentedButtonColorsCached$material3_release, reason: from getter */
    public final SegmentedButtonColors getDefaultSegmentedButtonColorsCached() {
        return this.defaultSegmentedButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultSliderColorsCached$material3_release, reason: from getter */
    public final SliderColors getDefaultSliderColorsCached() {
        return this.defaultSliderColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultSuggestionChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultSuggestionChipColorsCached() {
        return this.defaultSuggestionChipColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultSwitchColorsCached$material3_release, reason: from getter */
    public final SwitchColors getDefaultSwitchColorsCached() {
        return this.defaultSwitchColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultTextButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultTextButtonColorsCached() {
        return this.defaultTextButtonColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultTextFieldColorsCached$material3_release, reason: from getter */
    public final TextFieldColors getDefaultTextFieldColorsCached() {
        return this.defaultTextFieldColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultTimePickerColorsCached$material3_release, reason: from getter */
    public final TimePickerColors getDefaultTimePickerColorsCached() {
        return this.defaultTimePickerColorsCached;
    }

    @Nullable
    /* renamed from: getDefaultTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultTopAppBarColorsCached() {
        return this.defaultTopAppBarColorsCached;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
    public final long getError() {
        return this.error;
    }

    /* renamed from: getErrorContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorContainer() {
        return this.errorContainer;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    /* renamed from: getInversePrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getInversePrimary() {
        return this.inversePrimary;
    }

    /* renamed from: getInverseSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getInverseSurface() {
        return this.inverseSurface;
    }

    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* renamed from: getOnError-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnError() {
        return this.onError;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnErrorContainer() {
        return this.onErrorContainer;
    }

    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimary() {
        return this.onPrimary;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondary() {
        return this.onSecondary;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSurface() {
        return this.onSurface;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    /* renamed from: getOnTertiary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiary() {
        return this.onTertiary;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    /* renamed from: getOutline-0d7_KjU, reason: not valid java name and from getter */
    public final long getOutline() {
        return this.outline;
    }

    /* renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOutlineVariant() {
        return this.outlineVariant;
    }

    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary() {
        return this.primary;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimaryContainer() {
        return this.primaryContainer;
    }

    /* renamed from: getScrim-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrim() {
        return this.scrim;
    }

    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondaryContainer() {
        return this.secondaryContainer;
    }

    /* renamed from: getSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurface() {
        return this.surface;
    }

    /* renamed from: getSurfaceBright-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceBright() {
        return this.surfaceBright;
    }

    /* renamed from: getSurfaceContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainer() {
        return this.surfaceContainer;
    }

    /* renamed from: getSurfaceContainerHigh-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    /* renamed from: getSurfaceContainerHighest-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    /* renamed from: getSurfaceContainerLow-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    /* renamed from: getSurfaceContainerLowest-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerLowest() {
        return this.surfaceContainerLowest;
    }

    /* renamed from: getSurfaceDim-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceDim() {
        return this.surfaceDim;
    }

    /* renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceTint() {
        return this.surfaceTint;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    /* renamed from: getTertiary-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary() {
        return this.tertiary;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public final void setDefaultAssistChipColorsCached$material3_release(@Nullable ChipColors chipColors) {
        this.defaultAssistChipColorsCached = chipColors;
    }

    public final void setDefaultButtonColorsCached$material3_release(@Nullable ButtonColors buttonColors) {
        this.defaultButtonColorsCached = buttonColors;
    }

    public final void setDefaultCardColorsCached$material3_release(@Nullable CardColors cardColors) {
        this.defaultCardColorsCached = cardColors;
    }

    public final void setDefaultCenterAlignedTopAppBarColorsCached$material3_release(@Nullable TopAppBarColors topAppBarColors) {
        this.defaultCenterAlignedTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultCheckboxColorsCached$material3_release(@Nullable CheckboxColors checkboxColors) {
        this.defaultCheckboxColorsCached = checkboxColors;
    }

    public final void setDefaultDatePickerColorsCached$material3_release(@Nullable DatePickerColors datePickerColors) {
        this.defaultDatePickerColorsCached = datePickerColors;
    }

    public final void setDefaultElevatedAssistChipColorsCached$material3_release(@Nullable ChipColors chipColors) {
        this.defaultElevatedAssistChipColorsCached = chipColors;
    }

    public final void setDefaultElevatedButtonColorsCached$material3_release(@Nullable ButtonColors buttonColors) {
        this.defaultElevatedButtonColorsCached = buttonColors;
    }

    public final void setDefaultElevatedCardColorsCached$material3_release(@Nullable CardColors cardColors) {
        this.defaultElevatedCardColorsCached = cardColors;
    }

    public final void setDefaultElevatedFilterChipColorsCached$material3_release(@Nullable SelectableChipColors selectableChipColors) {
        this.defaultElevatedFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultElevatedSuggestionChipColorsCached$material3_release(@Nullable ChipColors chipColors) {
        this.defaultElevatedSuggestionChipColorsCached = chipColors;
    }

    /* renamed from: setDefaultExpressiveNavigationBarItemColorsCached$material3_release */
    public final void m1030x8a7577ad(@Nullable NavigationItemColors navigationItemColors) {
        this.defaultExpressiveNavigationBarItemColorsCached = navigationItemColors;
    }

    public final void setDefaultFilledIconButtonColorsCached$material3_release(@Nullable IconButtonColors iconButtonColors) {
        this.defaultFilledIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultFilledIconToggleButtonColorsCached$material3_release(@Nullable IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultFilledTonalButtonColorsCached$material3_release(@Nullable ButtonColors buttonColors) {
        this.defaultFilledTonalButtonColorsCached = buttonColors;
    }

    public final void setDefaultFilledTonalIconButtonColorsCached$material3_release(@Nullable IconButtonColors iconButtonColors) {
        this.defaultFilledTonalIconButtonColorsCached = iconButtonColors;
    }

    /* renamed from: setDefaultFilledTonalIconToggleButtonColorsCached$material3_release */
    public final void m1031xa626b4be(@Nullable IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledTonalIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultFilterChipColorsCached$material3_release(@Nullable SelectableChipColors selectableChipColors) {
        this.defaultFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultIconButtonColorsCached$material3_release(@Nullable IconButtonColors iconButtonColors) {
        this.defaultIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultIconToggleButtonColorsCached$material3_release(@Nullable IconToggleButtonColors iconToggleButtonColors) {
        this.defaultIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultInputChipColorsCached$material3_release(@Nullable SelectableChipColors selectableChipColors) {
        this.defaultInputChipColorsCached = selectableChipColors;
    }

    public final void setDefaultLargeTopAppBarColorsCached$material3_release(@Nullable TopAppBarColors topAppBarColors) {
        this.defaultLargeTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultMediumTopAppBarColorsCached$material3_release(@Nullable TopAppBarColors topAppBarColors) {
        this.defaultMediumTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultMenuItemColorsCached$material3_release(@Nullable MenuItemColors menuItemColors) {
        this.defaultMenuItemColorsCached = menuItemColors;
    }

    public final void setDefaultNavigationBarItemColorsCached$material3_release(@Nullable NavigationBarItemColors navigationBarItemColors) {
        this.defaultNavigationBarItemColorsCached = navigationBarItemColors;
    }

    public final void setDefaultNavigationRailItemColorsCached$material3_release(@Nullable NavigationRailItemColors navigationRailItemColors) {
        this.defaultNavigationRailItemColorsCached = navigationRailItemColors;
    }

    public final void setDefaultOutlinedButtonColorsCached$material3_release(@Nullable ButtonColors buttonColors) {
        this.defaultOutlinedButtonColorsCached = buttonColors;
    }

    public final void setDefaultOutlinedCardColorsCached$material3_release(@Nullable CardColors cardColors) {
        this.defaultOutlinedCardColorsCached = cardColors;
    }

    public final void setDefaultOutlinedIconButtonColorsCached$material3_release(@Nullable IconButtonColors iconButtonColors) {
        this.defaultOutlinedIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultOutlinedIconToggleButtonColorsCached$material3_release(@Nullable IconToggleButtonColors iconToggleButtonColors) {
        this.defaultOutlinedIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3_release(@Nullable TextFieldColors textFieldColors) {
        this.defaultOutlinedTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultRadioButtonColorsCached$material3_release(@Nullable RadioButtonColors radioButtonColors) {
        this.defaultRadioButtonColorsCached = radioButtonColors;
    }

    public final void setDefaultRichTooltipColorsCached$material3_release(@Nullable RichTooltipColors richTooltipColors) {
        this.defaultRichTooltipColorsCached = richTooltipColors;
    }

    public final void setDefaultSegmentedButtonColorsCached$material3_release(@Nullable SegmentedButtonColors segmentedButtonColors) {
        this.defaultSegmentedButtonColorsCached = segmentedButtonColors;
    }

    public final void setDefaultSliderColorsCached$material3_release(@Nullable SliderColors sliderColors) {
        this.defaultSliderColorsCached = sliderColors;
    }

    public final void setDefaultSuggestionChipColorsCached$material3_release(@Nullable ChipColors chipColors) {
        this.defaultSuggestionChipColorsCached = chipColors;
    }

    public final void setDefaultSwitchColorsCached$material3_release(@Nullable SwitchColors switchColors) {
        this.defaultSwitchColorsCached = switchColors;
    }

    public final void setDefaultTextButtonColorsCached$material3_release(@Nullable ButtonColors buttonColors) {
        this.defaultTextButtonColorsCached = buttonColors;
    }

    public final void setDefaultTextFieldColorsCached$material3_release(@Nullable TextFieldColors textFieldColors) {
        this.defaultTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultTimePickerColorsCached$material3_release(@Nullable TimePickerColors timePickerColors) {
        this.defaultTimePickerColorsCached = timePickerColors;
    }

    public final void setDefaultTopAppBarColorsCached$material3_release(@Nullable TopAppBarColors topAppBarColors) {
        this.defaultTopAppBarColorsCached = topAppBarColors;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ColorScheme(primary=");
        AbstractC0584a.m919t(this.primary, "onPrimary=", sb);
        AbstractC0584a.m919t(this.onPrimary, "primaryContainer=", sb);
        AbstractC0584a.m919t(this.primaryContainer, "onPrimaryContainer=", sb);
        AbstractC0584a.m919t(this.onPrimaryContainer, "inversePrimary=", sb);
        AbstractC0584a.m919t(this.inversePrimary, "secondary=", sb);
        AbstractC0584a.m919t(this.secondary, "onSecondary=", sb);
        AbstractC0584a.m919t(this.onSecondary, "secondaryContainer=", sb);
        AbstractC0584a.m919t(this.secondaryContainer, "onSecondaryContainer=", sb);
        AbstractC0584a.m919t(this.onSecondaryContainer, "tertiary=", sb);
        AbstractC0584a.m919t(this.tertiary, "onTertiary=", sb);
        AbstractC0584a.m919t(this.onTertiary, "tertiaryContainer=", sb);
        AbstractC0584a.m919t(this.tertiaryContainer, "onTertiaryContainer=", sb);
        AbstractC0584a.m919t(this.onTertiaryContainer, "background=", sb);
        AbstractC0584a.m919t(this.background, "onBackground=", sb);
        AbstractC0584a.m919t(this.onBackground, "surface=", sb);
        AbstractC0584a.m919t(this.surface, "onSurface=", sb);
        AbstractC0584a.m919t(this.onSurface, "surfaceVariant=", sb);
        AbstractC0584a.m919t(this.surfaceVariant, "onSurfaceVariant=", sb);
        AbstractC0584a.m919t(this.onSurfaceVariant, "surfaceTint=", sb);
        AbstractC0584a.m919t(this.surfaceTint, "inverseSurface=", sb);
        AbstractC0584a.m919t(this.inverseSurface, "inverseOnSurface=", sb);
        AbstractC0584a.m919t(this.inverseOnSurface, "error=", sb);
        AbstractC0584a.m919t(this.error, "onError=", sb);
        AbstractC0584a.m919t(this.onError, "errorContainer=", sb);
        AbstractC0584a.m919t(this.errorContainer, "onErrorContainer=", sb);
        AbstractC0584a.m919t(this.onErrorContainer, "outline=", sb);
        AbstractC0584a.m919t(this.outline, "outlineVariant=", sb);
        AbstractC0584a.m919t(this.outlineVariant, "scrim=", sb);
        AbstractC0584a.m919t(this.scrim, "surfaceBright=", sb);
        AbstractC0584a.m919t(this.surfaceBright, "surfaceDim=", sb);
        AbstractC0584a.m919t(this.surfaceDim, "surfaceContainer=", sb);
        AbstractC0584a.m919t(this.surfaceContainer, "surfaceContainerHigh=", sb);
        AbstractC0584a.m919t(this.surfaceContainerHigh, "surfaceContainerHighest=", sb);
        AbstractC0584a.m919t(this.surfaceContainerHighest, "surfaceContainerLow=", sb);
        AbstractC0584a.m919t(this.surfaceContainerLow, "surfaceContainerLowest=", sb);
        sb.append((Object) Color.m10690toStringimpl(this.surfaceContainerLowest));
        sb.append(')');
        return sb.toString();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use constructor with additional 'surfaceContainer' roles.", replaceWith = @ReplaceWith(expression = "ColorScheme(primary,\nonPrimary,\nprimaryContainer,\nonPrimaryContainer,\ninversePrimary,\nsecondary,\nonSecondary,\nsecondaryContainer,\nonSecondaryContainer,\ntertiary,\nonTertiary,\ntertiaryContainer,\nonTertiaryContainer,\nbackground,\nonBackground,\nsurface,\nonSurface,\nsurfaceVariant,\nonSurfaceVariant,\nsurfaceTint,\ninverseSurface,\ninverseOnSurface,\nerror,\nonError,\nerrorContainer,\nonErrorContainer,\noutline,\noutlineVariant,\nscrim,\nsurfaceBright,\nsurfaceDim,\nsurfaceContainer,\nsurfaceContainerHigh,\nsurfaceContainerHighest,\nsurfaceContainerLow,\nsurfaceContainerLowest,)", imports = {}))
    public /* synthetic */ ColorScheme(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35);
    }

    private ColorScheme(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        this.primary = j7;
        this.onPrimary = j8;
        this.primaryContainer = j9;
        this.onPrimaryContainer = j10;
        this.inversePrimary = j11;
        this.secondary = j12;
        this.onSecondary = j13;
        this.secondaryContainer = j14;
        this.onSecondaryContainer = j15;
        this.tertiary = j16;
        this.onTertiary = j17;
        this.tertiaryContainer = j18;
        this.onTertiaryContainer = j19;
        this.background = j20;
        this.onBackground = j21;
        this.surface = j22;
        this.onSurface = j23;
        this.surfaceVariant = j24;
        this.onSurfaceVariant = j25;
        this.surfaceTint = j26;
        this.inverseSurface = j27;
        this.inverseOnSurface = j28;
        this.error = j29;
        this.onError = j30;
        this.errorContainer = j31;
        this.onErrorContainer = j32;
        this.outline = j33;
        this.outlineVariant = j34;
        this.scrim = j35;
        this.surfaceBright = j36;
        this.surfaceDim = j37;
        this.surfaceContainer = j38;
        this.surfaceContainerHigh = j39;
        this.surfaceContainerHighest = j40;
        this.surfaceContainerLow = j41;
        this.surfaceContainerLowest = j42;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ColorScheme(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35) {
        Color.Companion companion = Color.INSTANCE;
        this(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), null);
    }
}
