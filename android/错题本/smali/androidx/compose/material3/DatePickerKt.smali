.class public final Landroidx/compose/material3/DatePickerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0015\u0008\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0008\u00082\u0015\u0008\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0008\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001aH\u0010\u001c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0018H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001aT\u0010\"\u001a\u00020\u00002\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0018H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!\u001a\u0084\u0001\u0010+\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0008\u00082\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0008\u00082\u0013\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0008\u00082\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010\'\u001a\u00020&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0008\u0008H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010*\u001a6\u00101\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00162\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070-H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008/\u00100\u001a\u009c\u0001\u0010>\u001a\u00020\u00072\u0008\u00102\u001a\u0004\u0018\u00010\u00112\u0006\u00103\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00162#\u00107\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u00084\u0012\u0008\u00085\u0012\u0004\u0008\u0008(6\u0012\u0004\u0012\u00020\u00070-2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u00084\u0012\u0008\u00085\u0012\u0004\u0008\u0008(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008<\u0010=\u001a\u008f\u0001\u0010?\u001a\u00020\u00072\u0008\u00102\u001a\u0004\u0018\u00010\u00112\u0006\u00103\u001a\u00020\u00112!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u00084\u0012\u0008\u00085\u0012\u0004\u0008\u0008(6\u0012\u0004\u0012\u00020\u00070-2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u00084\u0012\u0008\u00085\u0012\u0004\u0008\u0008(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008?\u0010@\u001aZ\u0010G\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0008\u00082\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0008\u0008H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008E\u0010F\u001a\u008f\u0001\u0010J\u001a\u00020\u00072\u0006\u0010I\u001a\u00020H2\u0008\u00102\u001a\u0004\u0018\u00010\u00112!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u00084\u0012\u0008\u00085\u0012\u0004\u0008\u0008(6\u0012\u0004\u0012\u00020\u00070-2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u00084\u0012\u0008\u00085\u0012\u0004\u0008\u0008(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008J\u0010K\u001aK\u0010L\u001a\u00020\u00072\u0006\u0010I\u001a\u00020H2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u00084\u0012\u0008\u00085\u0012\u0004\u0008\u0008(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u0014H\u0080@\u00a2\u0006\u0004\u0008L\u0010M\u001a\u001f\u0010N\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008N\u0010O\u001ax\u0010W\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020P2!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u00084\u0012\u0008\u00085\u0012\u0004\u0008\u0008(6\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010R\u001a\u00020\u00112\u0008\u0010S\u001a\u0004\u0018\u00010\u00112\u0008\u0010T\u001a\u0004\u0018\u00010\u00112\u0008\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0001\u00a2\u0006\u0004\u0008W\u0010X\u001a\u0017\u0010Z\u001a\u00020Y2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u00a2\u0006\u0004\u0008Z\u0010[\u001a9\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008b\u0010c\u001ap\u0010k\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u000b2\u000c\u0010e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020a2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0008\u0008H\u0003\u00a2\u0006\u0004\u0008k\u0010l\u001ab\u0010o\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00112!\u0010n\u001a\u001d\u0012\u0013\u0012\u00110Y\u00a2\u0006\u000c\u00084\u0012\u0008\u00085\u0012\u0004\u0008\u0008(m\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008o\u0010p\u001a`\u0010r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020\u000b2\u000c\u0010e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020a2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0008\u0008H\u0003\u00a2\u0006\u0004\u0008r\u0010s\u001ai\u0010{\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020\u000b2\u0006\u0010w\u001a\u00020a2\u000c\u0010x\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010y\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010z\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008{\u0010|\u001aB\u0010~\u001a\u00020\u00072\u000c\u0010e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010}\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0008\u0008H\u0003\u00a2\u0006\u0004\u0008~\u0010\u007f\u001a?\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010\u0085\u00012\u0007\u0010\u0001\u001a\u00030\u0080\u00012\u0008\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020a2\u0007\u0010\u0084\u0001\u001a\u00020aH\u0002\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0088\u0001\"\u001f\u0010\u0089\u0001\u001a\u00020&8\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001\u001a\u0006\u0008\u008b\u0001\u0010\u008c\u0001\"\u001f\u0010\u008d\u0001\u001a\u00020&8\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u008d\u0001\u0010\u008a\u0001\u001a\u0006\u0008\u008e\u0001\u0010\u008c\u0001\"\u001f\u0010\u008f\u0001\u001a\u00020&8\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u008f\u0001\u0010\u008a\u0001\u001a\u0006\u0008\u0090\u0001\u0010\u008c\u0001\" \u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001\u001a\u0006\u0008\u0094\u0001\u0010\u0095\u0001\"\u0018\u0010\u0096\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0096\u0001\u0010\u0093\u0001\"\u0018\u0010\u0097\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u0093\u0001\"\u0017\u0010\u0098\u0001\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0098\u0001\u0010\u008a\u0001\"\u0017\u0010\u0099\u0001\u001a\u00020Y8\u0002X\u0082T\u00a2\u0006\u0008\n\u0006\u0008\u0099\u0001\u0010\u009a\u0001\"\u0017\u0010\u009b\u0001\u001a\u00020Y8\u0002X\u0082T\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0001\u0010\u009a\u0001\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u009c\u0001\u00b2\u0006\u000e\u0010v\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/material3/DatePickerState;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/material3/DatePickerFormatter;",
        "dateFormatter",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "Landroidx/compose/runtime/Composable;",
        "title",
        "headline",
        "",
        "showModeToggle",
        "Landroidx/compose/material3/DatePickerColors;",
        "colors",
        "DatePicker",
        "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lr6/e;Lr6/e;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V",
        "",
        "initialSelectedDateMillis",
        "initialDisplayedMonthMillis",
        "Lx6/f;",
        "yearRange",
        "Landroidx/compose/material3/DisplayMode;",
        "initialDisplayMode",
        "Landroidx/compose/material3/SelectableDates;",
        "selectableDates",
        "rememberDatePickerState-EU0dCGE",
        "(Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;",
        "rememberDatePickerState",
        "Ljava/util/Locale;",
        "Landroidx/compose/material3/CalendarLocale;",
        "locale",
        "DatePickerState-sHin3Bw",
        "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DatePickerState;",
        "DatePickerState",
        "modeToggleButton",
        "Landroidx/compose/ui/text/TextStyle;",
        "headlineTextStyle",
        "Landroidx/compose/ui/unit/Dp;",
        "headerMinHeight",
        "content",
        "DateEntryContainer-au3_HiA",
        "(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLr6/e;Landroidx/compose/runtime/Composer;I)V",
        "DateEntryContainer",
        "displayMode",
        "Lkotlin/Function1;",
        "onDisplayModeChange",
        "DisplayModeToggleButton-tER2X8s",
        "(Landroidx/compose/ui/Modifier;ILr6/c;Landroidx/compose/runtime/Composer;I)V",
        "DisplayModeToggleButton",
        "selectedDateMillis",
        "displayedMonthMillis",
        "Lkotlin/ParameterName;",
        "name",
        "dateInMillis",
        "onDateSelectionChange",
        "monthInMillis",
        "onDisplayedMonthChange",
        "Landroidx/compose/material3/internal/CalendarModel;",
        "calendarModel",
        "SwitchableDateEntryContent-d7iavvg",
        "(Ljava/lang/Long;JILr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "SwitchableDateEntryContent",
        "DatePickerContent",
        "(Ljava/lang/Long;JLr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/graphics/Color;",
        "titleContentColor",
        "headlineContentColor",
        "minHeight",
        "DatePickerHeader-pc5RIQQ",
        "(Landroidx/compose/ui/Modifier;Lr6/e;JJFLr6/e;Landroidx/compose/runtime/Composer;I)V",
        "DatePickerHeader",
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "lazyListState",
        "HorizontalMonthsList",
        "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "updateDisplayedMonth",
        "(Landroidx/compose/foundation/lazy/LazyListState;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Lh6/c;)Ljava/lang/Object;",
        "WeekDays",
        "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/material3/internal/CalendarMonth;",
        "month",
        "todayMillis",
        "startDateMillis",
        "endDateMillis",
        "Landroidx/compose/material3/SelectedRangeInfo;",
        "rangeSelectionInfo",
        "Month",
        "(Landroidx/compose/material3/internal/CalendarMonth;Lr6/c;JLjava/lang/Long;Ljava/lang/Long;Landroidx/compose/material3/SelectedRangeInfo;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "",
        "numberOfMonthsInRange",
        "(Lx6/f;)I",
        "rangeSelectionEnabled",
        "isToday",
        "isStartDate",
        "isEndDate",
        "isInRange",
        "",
        "dayContentDescription",
        "(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;",
        "selected",
        "onClick",
        "animateChecked",
        "enabled",
        "today",
        "inRange",
        "description",
        "Day",
        "(Landroidx/compose/ui/Modifier;ZLr6/a;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V",
        "year",
        "onYearSelected",
        "YearPicker",
        "(Landroidx/compose/ui/Modifier;JLr6/c;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "currentYear",
        "Year",
        "(Landroidx/compose/ui/Modifier;ZZLr6/a;ZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V",
        "nextAvailable",
        "previousAvailable",
        "yearPickerVisible",
        "yearPickerText",
        "onNextClicked",
        "onPreviousClicked",
        "onYearPickerButtonClicked",
        "MonthsNavigation",
        "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "expanded",
        "YearPickerMenuButton",
        "(Lr6/a;ZLandroidx/compose/ui/Modifier;Lr6/e;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
        "Lkotlinx/coroutines/v;",
        "coroutineScope",
        "scrollUpLabel",
        "scrollDownLabel",
        "",
        "Landroidx/compose/ui/semantics/CustomAccessibilityAction;",
        "customScrollActions",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/v;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;",
        "RecommendedSizeForAccessibility",
        "F",
        "getRecommendedSizeForAccessibility",
        "()F",
        "MonthYearHeight",
        "getMonthYearHeight",
        "DatePickerHorizontalPadding",
        "getDatePickerHorizontalPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "DatePickerModeTogglePadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "getDatePickerModeTogglePadding",
        "()Landroidx/compose/foundation/layout/PaddingValues;",
        "DatePickerTitlePadding",
        "DatePickerHeadlinePadding",
        "YearsVerticalPadding",
        "MaxCalendarRows",
        "I",
        "YearsInRow",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 15 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 16 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2272:1\n1223#2,6:2273\n1223#2,6:2279\n1223#2,6:2285\n1223#2,6:2331\n1223#2,6:2337\n1223#2,6:2346\n1223#2,6:2352\n1223#2,3:2363\n1226#2,3:2369\n1223#2,6:2410\n1223#2,6:2416\n1223#2,6:2422\n1223#2,6:2552\n1223#2,6:2558\n1223#2,6:2600\n1223#2,6:2650\n1223#2,6:2724\n1223#2,6:2730\n1223#2,6:2736\n1223#2,6:2754\n1223#2,6:2760\n1223#2,6:2766\n85#3:2291\n82#3,6:2292\n88#3:2326\n92#3:2330\n85#3:2373\n81#3,7:2374\n88#3:2409\n85#3:2465\n82#3,6:2466\n88#3:2500\n92#3:2504\n92#3:2512\n85#3:2513\n83#3,5:2514\n88#3:2547\n92#3:2551\n85#3:2657\n83#3,5:2658\n88#3:2691\n92#3:2749\n78#4,6:2298\n85#4,4:2313\n89#4,2:2323\n93#4:2329\n78#4,6:2381\n85#4,4:2396\n89#4,2:2406\n78#4,6:2436\n85#4,4:2451\n89#4,2:2461\n78#4,6:2472\n85#4,4:2487\n89#4,2:2497\n93#4:2503\n93#4:2507\n93#4:2511\n78#4,6:2519\n85#4,4:2534\n89#4,2:2544\n93#4:2550\n78#4,6:2567\n85#4,4:2582\n89#4,2:2592\n78#4,6:2612\n85#4,4:2627\n89#4,2:2637\n93#4:2643\n93#4:2648\n78#4,6:2663\n85#4,4:2678\n89#4,2:2688\n78#4,6:2695\n85#4,4:2710\n89#4,2:2720\n93#4:2744\n93#4:2748\n78#4,6:2775\n85#4,4:2790\n89#4,2:2800\n93#4:2806\n368#5,9:2304\n377#5:2325\n378#5,2:2327\n368#5,9:2387\n377#5:2408\n368#5,9:2442\n377#5:2463\n368#5,9:2478\n377#5:2499\n378#5,2:2501\n378#5,2:2505\n378#5,2:2509\n368#5,9:2525\n377#5:2546\n378#5,2:2548\n368#5,9:2573\n377#5:2594\n368#5,9:2618\n377#5:2639\n378#5,2:2641\n378#5,2:2646\n368#5,9:2669\n377#5:2690\n368#5,9:2701\n377#5:2722\n378#5,2:2742\n378#5,2:2746\n368#5,9:2781\n377#5:2802\n378#5,2:2804\n4032#6,6:2317\n4032#6,6:2400\n4032#6,6:2455\n4032#6,6:2491\n4032#6,6:2538\n4032#6,6:2586\n4032#6,6:2631\n4032#6,6:2682\n4032#6,6:2714\n4032#6,6:2794\n77#7:2343\n77#7:2808\n1#8:2344\n148#9:2345\n148#9:2812\n148#9:2813\n148#9:2814\n148#9:2815\n148#9:2816\n148#9:2817\n148#9:2818\n488#10:2358\n487#10,4:2359\n491#10,2:2366\n495#10:2372\n487#11:2368\n71#12:2428\n67#12,7:2429\n74#12:2464\n78#12:2508\n71#12:2606\n69#12,5:2607\n74#12:2640\n78#12:2644\n98#13,3:2564\n101#13:2595\n105#13:2649\n98#13,3:2692\n101#13:2723\n105#13:2745\n98#13,3:2772\n101#13:2803\n105#13:2807\n33#14,4:2596\n38#14:2645\n86#15:2656\n156#16:2750\n159#16:2751\n168#16:2752\n114#16:2753\n81#17:2809\n107#17,2:2810\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n*L\n172#1:2273,6\n191#1:2279,6\n367#1:2285,6\n1364#1:2331,6\n1371#1:2337,6\n1408#1:2346,6\n1498#1:2352,6\n1510#1:2363,3\n1510#1:2369,3\n1524#1:2410,6\n1536#1:2416,6\n1548#1:2422,6\n1660#1:2552,6\n1697#1:2558,6\n1751#1:2600,6\n1786#1:2650,6\n1831#1:2724,6\n1859#1:2730,6\n1865#1:2736,6\n1952#1:2754,6\n2100#1:2760,6\n2118#1:2766,6\n1310#1:2291\n1310#1:2292,6\n1310#1:2326\n1310#1:2330\n1513#1:2373\n1513#1:2374,7\n1513#1:2409\n1553#1:2465\n1553#1:2466,6\n1553#1:2500\n1553#1:2504\n1513#1:2512\n1630#1:2513\n1630#1:2514,5\n1630#1:2547\n1630#1:2551\n1796#1:2657\n1796#1:2658,5\n1796#1:2691\n1796#1:2749\n1310#1:2298,6\n1310#1:2313,4\n1310#1:2323,2\n1310#1:2329\n1513#1:2381,6\n1513#1:2396,4\n1513#1:2406,2\n1552#1:2436,6\n1552#1:2451,4\n1552#1:2461,2\n1553#1:2472,6\n1553#1:2487,4\n1553#1:2497,2\n1553#1:2503\n1552#1:2507\n1513#1:2511\n1630#1:2519,6\n1630#1:2534,4\n1630#1:2544,2\n1630#1:2550\n1742#1:2567,6\n1742#1:2582,4\n1742#1:2592,2\n1749#1:2612,6\n1749#1:2627,4\n1749#1:2637,2\n1749#1:2643\n1742#1:2648\n1796#1:2663,6\n1796#1:2678,4\n1796#1:2688,2\n1803#1:2695,6\n1803#1:2710,4\n1803#1:2720,2\n1803#1:2744\n1796#1:2748\n2152#1:2775,6\n2152#1:2790,4\n2152#1:2800,2\n2152#1:2806\n1310#1:2304,9\n1310#1:2325\n1310#1:2327,2\n1513#1:2387,9\n1513#1:2408\n1552#1:2442,9\n1552#1:2463\n1553#1:2478,9\n1553#1:2499\n1553#1:2501,2\n1552#1:2505,2\n1513#1:2509,2\n1630#1:2525,9\n1630#1:2546\n1630#1:2548,2\n1742#1:2573,9\n1742#1:2594\n1749#1:2618,9\n1749#1:2639\n1749#1:2641,2\n1742#1:2646,2\n1796#1:2669,9\n1796#1:2690\n1803#1:2701,9\n1803#1:2722\n1803#1:2742,2\n1796#1:2746,2\n2152#1:2781,9\n2152#1:2802\n2152#1:2804,2\n1310#1:2317,6\n1513#1:2400,6\n1552#1:2455,6\n1553#1:2491,6\n1630#1:2538,6\n1742#1:2586,6\n1749#1:2631,6\n1796#1:2682,6\n1803#1:2714,6\n2152#1:2794,6\n1400#1:2343\n2213#1:2808\n1400#1:2345\n2260#1:2812\n2261#1:2813\n2262#1:2814\n2263#1:2815\n2265#1:2816\n2266#1:2817\n2268#1:2818\n1510#1:2358\n1510#1:2359,4\n1510#1:2366,2\n1510#1:2372\n1510#1:2368\n1552#1:2428\n1552#1:2429,7\n1552#1:2464\n1552#1:2508\n1749#1:2606\n1749#1:2607,5\n1749#1:2640\n1749#1:2644\n1742#1:2564,3\n1742#1:2595\n1742#1:2649\n1803#1:2692,3\n1803#1:2723\n1803#1:2745\n2152#1:2772,3\n2152#1:2803\n2152#1:2807\n1748#1:2596,4\n1748#1:2645\n1798#1:2656\n1915#1:2750\n1917#1:2751\n1919#1:2752\n1924#1:2753\n1511#1:2809\n1511#1:2810,2\n*E\n"
    }
.end annotation


# static fields
.field private static final DatePickerHeadlinePadding:Landroidx/compose/foundation/layout/PaddingValues;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DatePickerHorizontalPadding:F

.field private static final DatePickerModeTogglePadding:Landroidx/compose/foundation/layout/PaddingValues;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DatePickerTitlePadding:Landroidx/compose/foundation/layout/PaddingValues;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MaxCalendarRows:I = 0x6

.field private static final MonthYearHeight:F

.field private static final RecommendedSizeForAccessibility:F

.field private static final YearsInRow:I = 0x3

.field private static final YearsVerticalPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Landroidx/compose/material3/DatePickerKt;->RecommendedSizeForAccessibility:F

    .line 9
    .line 10
    const/16 v0, 0x38

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sput v0, Landroidx/compose/material3/DatePickerKt;->MonthYearHeight:F

    .line 18
    .line 19
    const/16 v0, 0xc

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    sput v1, Landroidx/compose/material3/DatePickerKt;->DatePickerHorizontalPadding:F

    .line 27
    .line 28
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sput-object v1, Landroidx/compose/material3/DatePickerKt;->DatePickerModeTogglePadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 45
    .line 46
    const/16 v1, 0x18

    .line 47
    .line 48
    int-to-float v1, v1

    .line 49
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const/16 v3, 0x10

    .line 58
    .line 59
    int-to-float v8, v3

    .line 60
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    const/16 v6, 0x8

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    sput-object v2, Landroidx/compose/material3/DatePickerKt;->DatePickerTitlePadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 72
    .line 73
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    const/4 v13, 0x2

    .line 86
    const/4 v14, 0x0

    .line 87
    const/4 v10, 0x0

    .line 88
    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    sput-object v0, Landroidx/compose/material3/DatePickerKt;->DatePickerHeadlinePadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 93
    .line 94
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    sput v0, Landroidx/compose/material3/DatePickerKt;->YearsVerticalPadding:F

    .line 99
    .line 100
    return-void
.end method

.method public static final DateEntryContainer-au3_HiA(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLr6/e;Landroidx/compose/runtime/Composer;I)V
    .locals 20
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/material3/DatePickerColors;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/ui/text/TextStyle;",
            "F",
            "Lr6/e;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p7

    .line 2
    .line 3
    move/from16 v9, p9

    .line 4
    .line 5
    const v0, 0x59d86e5f

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p8

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, v9, 0x6

    .line 15
    .line 16
    move-object/from16 v10, p0

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x2

    .line 29
    :goto_0
    or-int/2addr v2, v9

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v2, v9

    .line 32
    :goto_1
    and-int/lit8 v3, v9, 0x30

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    move-object/from16 v3, p1

    .line 37
    .line 38
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    const/16 v4, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v4, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v2, v4

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move-object/from16 v3, p1

    .line 52
    .line 53
    :goto_3
    and-int/lit16 v4, v9, 0x180

    .line 54
    .line 55
    if-nez v4, :cond_5

    .line 56
    .line 57
    move-object/from16 v4, p2

    .line 58
    .line 59
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    const/16 v5, 0x100

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    const/16 v5, 0x80

    .line 69
    .line 70
    :goto_4
    or-int/2addr v2, v5

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    move-object/from16 v4, p2

    .line 73
    .line 74
    :goto_5
    and-int/lit16 v5, v9, 0xc00

    .line 75
    .line 76
    if-nez v5, :cond_7

    .line 77
    .line 78
    move-object/from16 v5, p3

    .line 79
    .line 80
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_6

    .line 85
    .line 86
    const/16 v6, 0x800

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_6
    const/16 v6, 0x400

    .line 90
    .line 91
    :goto_6
    or-int/2addr v2, v6

    .line 92
    goto :goto_7

    .line 93
    :cond_7
    move-object/from16 v5, p3

    .line 94
    .line 95
    :goto_7
    and-int/lit16 v6, v9, 0x6000

    .line 96
    .line 97
    if-nez v6, :cond_9

    .line 98
    .line 99
    move-object/from16 v6, p4

    .line 100
    .line 101
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_8

    .line 106
    .line 107
    const/16 v7, 0x4000

    .line 108
    .line 109
    goto :goto_8

    .line 110
    :cond_8
    const/16 v7, 0x2000

    .line 111
    .line 112
    :goto_8
    or-int/2addr v2, v7

    .line 113
    goto :goto_9

    .line 114
    :cond_9
    move-object/from16 v6, p4

    .line 115
    .line 116
    :goto_9
    const/high16 v7, 0x30000

    .line 117
    .line 118
    and-int/2addr v7, v9

    .line 119
    if-nez v7, :cond_b

    .line 120
    .line 121
    move-object/from16 v7, p5

    .line 122
    .line 123
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-eqz v11, :cond_a

    .line 128
    .line 129
    const/high16 v11, 0x20000

    .line 130
    .line 131
    goto :goto_a

    .line 132
    :cond_a
    const/high16 v11, 0x10000

    .line 133
    .line 134
    :goto_a
    or-int/2addr v2, v11

    .line 135
    goto :goto_b

    .line 136
    :cond_b
    move-object/from16 v7, p5

    .line 137
    .line 138
    :goto_b
    const/high16 v11, 0x180000

    .line 139
    .line 140
    and-int/2addr v11, v9

    .line 141
    if-nez v11, :cond_d

    .line 142
    .line 143
    move/from16 v11, p6

    .line 144
    .line 145
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-eqz v12, :cond_c

    .line 150
    .line 151
    const/high16 v12, 0x100000

    .line 152
    .line 153
    goto :goto_c

    .line 154
    :cond_c
    const/high16 v12, 0x80000

    .line 155
    .line 156
    :goto_c
    or-int/2addr v2, v12

    .line 157
    goto :goto_d

    .line 158
    :cond_d
    move/from16 v11, p6

    .line 159
    .line 160
    :goto_d
    const/high16 v12, 0xc00000

    .line 161
    .line 162
    and-int/2addr v12, v9

    .line 163
    if-nez v12, :cond_f

    .line 164
    .line 165
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    if-eqz v12, :cond_e

    .line 170
    .line 171
    const/high16 v12, 0x800000

    .line 172
    .line 173
    goto :goto_e

    .line 174
    :cond_e
    const/high16 v12, 0x400000

    .line 175
    .line 176
    :goto_e
    or-int/2addr v2, v12

    .line 177
    :cond_f
    const v12, 0x492493

    .line 178
    .line 179
    .line 180
    and-int/2addr v12, v2

    .line 181
    const v13, 0x492492

    .line 182
    .line 183
    .line 184
    if-ne v12, v13, :cond_11

    .line 185
    .line 186
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 187
    .line 188
    .line 189
    move-result v12

    .line 190
    if-nez v12, :cond_10

    .line 191
    .line 192
    goto :goto_f

    .line 193
    :cond_10
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 194
    .line 195
    .line 196
    move-object v0, v1

    .line 197
    goto/16 :goto_11

    .line 198
    .line 199
    :cond_11
    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 200
    .line 201
    .line 202
    move-result v12

    .line 203
    if-eqz v12, :cond_12

    .line 204
    .line 205
    const/4 v12, -0x1

    .line 206
    const-string v13, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1308)"

    .line 207
    .line 208
    invoke-static {v0, v2, v12, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 209
    .line 210
    .line 211
    :cond_12
    sget-object v0, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 212
    .line 213
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getContainerWidth-D9Ej5fM()F

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    const/16 v15, 0xe

    .line 218
    .line 219
    const/16 v16, 0x0

    .line 220
    .line 221
    const/4 v12, 0x0

    .line 222
    const/4 v13, 0x0

    .line 223
    const/4 v14, 0x0

    .line 224
    move v11, v0

    .line 225
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/SizeKt;->sizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    sget-object v10, Landroidx/compose/material3/DatePickerKt$DateEntryContainer$1;->INSTANCE:Landroidx/compose/material3/DatePickerKt$DateEntryContainer$1;

    .line 230
    .line 231
    const/4 v11, 0x0

    .line 232
    const/4 v12, 0x0

    .line 233
    const/4 v13, 0x1

    .line 234
    invoke-static {v0, v12, v10, v13, v11}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLr6/c;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 235
    .line 236
    .line 237
    move-result-object v14

    .line 238
    invoke-virtual {v6}, Landroidx/compose/material3/DatePickerColors;->getContainerColor-0d7_KjU()J

    .line 239
    .line 240
    .line 241
    move-result-wide v15

    .line 242
    const/16 v18, 0x2

    .line 243
    .line 244
    const/16 v19, 0x0

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    sget-object v10, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 253
    .line 254
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    sget-object v11, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 259
    .line 260
    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 261
    .line 262
    .line 263
    move-result-object v11

    .line 264
    invoke-static {v10, v11, v1, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    invoke-static {v1, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 273
    .line 274
    .line 275
    move-result-object v12

    .line 276
    invoke-static {v1, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 281
    .line 282
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 283
    .line 284
    .line 285
    move-result-object v15

    .line 286
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 287
    .line 288
    .line 289
    move-result-object v16

    .line 290
    if-nez v16, :cond_13

    .line 291
    .line 292
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 293
    .line 294
    .line 295
    :cond_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 296
    .line 297
    .line 298
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 299
    .line 300
    .line 301
    move-result v16

    .line 302
    if-eqz v16, :cond_14

    .line 303
    .line 304
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 305
    .line 306
    .line 307
    goto :goto_10

    .line 308
    :cond_14
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 309
    .line 310
    .line 311
    :goto_10
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 312
    .line 313
    .line 314
    move-result-object v15

    .line 315
    invoke-static {v14, v15, v10, v15, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    if-nez v12, :cond_15

    .line 324
    .line 325
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v12

    .line 329
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v12

    .line 337
    if-nez v12, :cond_16

    .line 338
    .line 339
    :cond_15
    invoke-static {v11, v15, v11, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 340
    .line 341
    .line 342
    :cond_16
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    invoke-static {v15, v0, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 347
    .line 348
    .line 349
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 350
    .line 351
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 352
    .line 353
    invoke-virtual {v6}, Landroidx/compose/material3/DatePickerColors;->getTitleContentColor-0d7_KjU()J

    .line 354
    .line 355
    .line 356
    move-result-wide v16

    .line 357
    invoke-virtual {v6}, Landroidx/compose/material3/DatePickerColors;->getHeadlineContentColor-0d7_KjU()J

    .line 358
    .line 359
    .line 360
    move-result-wide v18

    .line 361
    new-instance v10, Landroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1;

    .line 362
    .line 363
    move-object v13, v3

    .line 364
    move-object v11, v4

    .line 365
    move-object v12, v5

    .line 366
    move-object v14, v6

    .line 367
    move-object v15, v7

    .line 368
    const/4 v3, 0x1

    .line 369
    invoke-direct/range {v10 .. v15}, Landroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1;-><init>(Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;)V

    .line 370
    .line 371
    .line 372
    const/16 v4, 0x36

    .line 373
    .line 374
    const v5, -0xda65ed2

    .line 375
    .line 376
    .line 377
    invoke-static {v5, v3, v10, v1, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    and-int/lit8 v4, v2, 0x70

    .line 382
    .line 383
    const v5, 0x30006

    .line 384
    .line 385
    .line 386
    or-int/2addr v4, v5

    .line 387
    const v5, 0xe000

    .line 388
    .line 389
    .line 390
    shr-int/lit8 v6, v2, 0x6

    .line 391
    .line 392
    and-int/2addr v5, v6

    .line 393
    or-int/2addr v4, v5

    .line 394
    move-object/from16 v11, p1

    .line 395
    .line 396
    move-object v10, v0

    .line 397
    move-wide/from16 v12, v16

    .line 398
    .line 399
    move-wide/from16 v14, v18

    .line 400
    .line 401
    move/from16 v16, p6

    .line 402
    .line 403
    move-object/from16 v18, v1

    .line 404
    .line 405
    move-object/from16 v17, v3

    .line 406
    .line 407
    move/from16 v19, v4

    .line 408
    .line 409
    invoke-static/range {v10 .. v19}, Landroidx/compose/material3/DatePickerKt;->DatePickerHeader-pc5RIQQ(Landroidx/compose/ui/Modifier;Lr6/e;JJFLr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 410
    .line 411
    .line 412
    move-object/from16 v0, v18

    .line 413
    .line 414
    shr-int/lit8 v1, v2, 0x15

    .line 415
    .line 416
    and-int/lit8 v1, v1, 0xe

    .line 417
    .line 418
    invoke-static {v0, v1, v8}, Landroidx/collection/a;->y(Landroidx/compose/runtime/Composer;ILr6/e;)Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-eqz v1, :cond_17

    .line 423
    .line 424
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 425
    .line 426
    .line 427
    :cond_17
    :goto_11
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 428
    .line 429
    .line 430
    move-result-object v10

    .line 431
    if-eqz v10, :cond_18

    .line 432
    .line 433
    new-instance v0, Landroidx/compose/material3/DatePickerKt$DateEntryContainer$3;

    .line 434
    .line 435
    move-object/from16 v1, p0

    .line 436
    .line 437
    move-object/from16 v2, p1

    .line 438
    .line 439
    move-object/from16 v3, p2

    .line 440
    .line 441
    move-object/from16 v4, p3

    .line 442
    .line 443
    move-object/from16 v5, p4

    .line 444
    .line 445
    move-object/from16 v6, p5

    .line 446
    .line 447
    move/from16 v7, p6

    .line 448
    .line 449
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/DatePickerKt$DateEntryContainer$3;-><init>(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLr6/e;I)V

    .line 450
    .line 451
    .line 452
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 453
    .line 454
    .line 455
    :cond_18
    return-void
.end method

.method public static final DatePicker(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lr6/e;Lr6/e;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .param p0    # Landroidx/compose/material3/DatePickerState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/DatePickerFormatter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/material3/DatePickerColors;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/DatePickerState;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Lr6/e;",
            "Lr6/e;",
            "Z",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move/from16 v8, p8

    .line 6
    .line 7
    const v2, 0x304311b5

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p7

    .line 11
    .line 12
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    and-int/lit8 v4, p9, 0x1

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    or-int/lit8 v4, v8, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v4, v8, 0x6

    .line 24
    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v4, 0x2

    .line 36
    :goto_0
    or-int/2addr v4, v8

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v4, v8

    .line 39
    :goto_1
    and-int/lit8 v5, p9, 0x2

    .line 40
    .line 41
    if-eqz v5, :cond_4

    .line 42
    .line 43
    or-int/lit8 v4, v4, 0x30

    .line 44
    .line 45
    :cond_3
    move-object/from16 v6, p1

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    and-int/lit8 v6, v8, 0x30

    .line 49
    .line 50
    if-nez v6, :cond_3

    .line 51
    .line 52
    move-object/from16 v6, p1

    .line 53
    .line 54
    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_5

    .line 59
    .line 60
    const/16 v7, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    const/16 v7, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v4, v7

    .line 66
    :goto_3
    and-int/lit16 v7, v8, 0x180

    .line 67
    .line 68
    if-nez v7, :cond_8

    .line 69
    .line 70
    and-int/lit8 v7, p9, 0x4

    .line 71
    .line 72
    if-nez v7, :cond_7

    .line 73
    .line 74
    and-int/lit16 v7, v8, 0x200

    .line 75
    .line 76
    if-nez v7, :cond_6

    .line 77
    .line 78
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    goto :goto_4

    .line 83
    :cond_6
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    :goto_4
    if-eqz v7, :cond_7

    .line 88
    .line 89
    const/16 v7, 0x100

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_7
    const/16 v7, 0x80

    .line 93
    .line 94
    :goto_5
    or-int/2addr v4, v7

    .line 95
    :cond_8
    and-int/lit8 v7, p9, 0x8

    .line 96
    .line 97
    if-eqz v7, :cond_a

    .line 98
    .line 99
    or-int/lit16 v4, v4, 0xc00

    .line 100
    .line 101
    :cond_9
    move-object/from16 v9, p3

    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_a
    and-int/lit16 v9, v8, 0xc00

    .line 105
    .line 106
    if-nez v9, :cond_9

    .line 107
    .line 108
    move-object/from16 v9, p3

    .line 109
    .line 110
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-eqz v10, :cond_b

    .line 115
    .line 116
    const/16 v10, 0x800

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_b
    const/16 v10, 0x400

    .line 120
    .line 121
    :goto_6
    or-int/2addr v4, v10

    .line 122
    :goto_7
    and-int/lit8 v10, p9, 0x10

    .line 123
    .line 124
    if-eqz v10, :cond_d

    .line 125
    .line 126
    or-int/lit16 v4, v4, 0x6000

    .line 127
    .line 128
    :cond_c
    move-object/from16 v11, p4

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_d
    and-int/lit16 v11, v8, 0x6000

    .line 132
    .line 133
    if-nez v11, :cond_c

    .line 134
    .line 135
    move-object/from16 v11, p4

    .line 136
    .line 137
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    if-eqz v12, :cond_e

    .line 142
    .line 143
    const/16 v12, 0x4000

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_e
    const/16 v12, 0x2000

    .line 147
    .line 148
    :goto_8
    or-int/2addr v4, v12

    .line 149
    :goto_9
    and-int/lit8 v12, p9, 0x20

    .line 150
    .line 151
    const/high16 v13, 0x30000

    .line 152
    .line 153
    if-eqz v12, :cond_10

    .line 154
    .line 155
    or-int/2addr v4, v13

    .line 156
    :cond_f
    move/from16 v13, p5

    .line 157
    .line 158
    goto :goto_b

    .line 159
    :cond_10
    and-int/2addr v13, v8

    .line 160
    if-nez v13, :cond_f

    .line 161
    .line 162
    move/from16 v13, p5

    .line 163
    .line 164
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    if-eqz v14, :cond_11

    .line 169
    .line 170
    const/high16 v14, 0x20000

    .line 171
    .line 172
    goto :goto_a

    .line 173
    :cond_11
    const/high16 v14, 0x10000

    .line 174
    .line 175
    :goto_a
    or-int/2addr v4, v14

    .line 176
    :goto_b
    const/high16 v14, 0x180000

    .line 177
    .line 178
    and-int/2addr v14, v8

    .line 179
    if-nez v14, :cond_14

    .line 180
    .line 181
    and-int/lit8 v14, p9, 0x40

    .line 182
    .line 183
    if-nez v14, :cond_12

    .line 184
    .line 185
    move-object/from16 v14, p6

    .line 186
    .line 187
    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v15

    .line 191
    if-eqz v15, :cond_13

    .line 192
    .line 193
    const/high16 v15, 0x100000

    .line 194
    .line 195
    goto :goto_c

    .line 196
    :cond_12
    move-object/from16 v14, p6

    .line 197
    .line 198
    :cond_13
    const/high16 v15, 0x80000

    .line 199
    .line 200
    :goto_c
    or-int/2addr v4, v15

    .line 201
    goto :goto_d

    .line 202
    :cond_14
    move-object/from16 v14, p6

    .line 203
    .line 204
    :goto_d
    const v15, 0x92493

    .line 205
    .line 206
    .line 207
    and-int/2addr v15, v4

    .line 208
    const v2, 0x92492

    .line 209
    .line 210
    .line 211
    if-ne v15, v2, :cond_16

    .line 212
    .line 213
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-nez v2, :cond_15

    .line 218
    .line 219
    goto :goto_f

    .line 220
    :cond_15
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 221
    .line 222
    .line 223
    move-object/from16 v17, v3

    .line 224
    .line 225
    move-object v2, v6

    .line 226
    move-object v4, v9

    .line 227
    move v6, v13

    .line 228
    move-object v7, v14

    .line 229
    move-object v3, v0

    .line 230
    :goto_e
    move-object v5, v11

    .line 231
    goto/16 :goto_16

    .line 232
    .line 233
    :cond_16
    :goto_f
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 234
    .line 235
    .line 236
    and-int/lit8 v2, v8, 0x1

    .line 237
    .line 238
    const p7, -0x380001

    .line 239
    .line 240
    .line 241
    const/4 v15, 0x1

    .line 242
    if-eqz v2, :cond_1a

    .line 243
    .line 244
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_17

    .line 249
    .line 250
    goto :goto_11

    .line 251
    :cond_17
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 252
    .line 253
    .line 254
    and-int/lit8 v2, p9, 0x4

    .line 255
    .line 256
    if-eqz v2, :cond_18

    .line 257
    .line 258
    and-int/lit16 v4, v4, -0x381

    .line 259
    .line 260
    :cond_18
    and-int/lit8 v2, p9, 0x40

    .line 261
    .line 262
    if-eqz v2, :cond_19

    .line 263
    .line 264
    and-int v4, v4, p7

    .line 265
    .line 266
    :cond_19
    move-object v10, v9

    .line 267
    move v2, v13

    .line 268
    move-object v13, v14

    .line 269
    :goto_10
    move-object v9, v6

    .line 270
    goto/16 :goto_13

    .line 271
    .line 272
    :cond_1a
    :goto_11
    if-eqz v5, :cond_1b

    .line 273
    .line 274
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 275
    .line 276
    move-object v6, v2

    .line 277
    :cond_1b
    and-int/lit8 v2, p9, 0x4

    .line 278
    .line 279
    if-eqz v2, :cond_1d

    .line 280
    .line 281
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 286
    .line 287
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    if-ne v0, v2, :cond_1c

    .line 292
    .line 293
    sget-object v19, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 294
    .line 295
    const/16 v23, 0x7

    .line 296
    .line 297
    const/16 v24, 0x0

    .line 298
    .line 299
    const/16 v20, 0x0

    .line 300
    .line 301
    const/16 v21, 0x0

    .line 302
    .line 303
    const/16 v22, 0x0

    .line 304
    .line 305
    invoke-static/range {v19 .. v24}, Landroidx/compose/material3/DatePickerDefaults;->dateFormatter$default(Landroidx/compose/material3/DatePickerDefaults;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/compose/material3/DatePickerFormatter;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    :cond_1c
    check-cast v0, Landroidx/compose/material3/DatePickerFormatter;

    .line 313
    .line 314
    and-int/lit16 v4, v4, -0x381

    .line 315
    .line 316
    :cond_1d
    if-eqz v7, :cond_1e

    .line 317
    .line 318
    new-instance v2, Landroidx/compose/material3/DatePickerKt$DatePicker$2;

    .line 319
    .line 320
    invoke-direct {v2, v1}, Landroidx/compose/material3/DatePickerKt$DatePicker$2;-><init>(Landroidx/compose/material3/DatePickerState;)V

    .line 321
    .line 322
    .line 323
    const v5, -0x59b4743f

    .line 324
    .line 325
    .line 326
    const/16 v7, 0x36

    .line 327
    .line 328
    invoke-static {v5, v15, v2, v3, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    move-object v9, v2

    .line 333
    goto :goto_12

    .line 334
    :cond_1e
    const/16 v7, 0x36

    .line 335
    .line 336
    :goto_12
    if-eqz v10, :cond_1f

    .line 337
    .line 338
    new-instance v2, Landroidx/compose/material3/DatePickerKt$DatePicker$3;

    .line 339
    .line 340
    invoke-direct {v2, v1, v0}, Landroidx/compose/material3/DatePickerKt$DatePicker$3;-><init>(Landroidx/compose/material3/DatePickerState;Landroidx/compose/material3/DatePickerFormatter;)V

    .line 341
    .line 342
    .line 343
    const v5, -0x6a194f29

    .line 344
    .line 345
    .line 346
    invoke-static {v5, v15, v2, v3, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    move-object v11, v2

    .line 351
    :cond_1f
    if-eqz v12, :cond_20

    .line 352
    .line 353
    move v13, v15

    .line 354
    :cond_20
    and-int/lit8 v2, p9, 0x40

    .line 355
    .line 356
    if-eqz v2, :cond_19

    .line 357
    .line 358
    sget-object v2, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 359
    .line 360
    const/4 v5, 0x6

    .line 361
    invoke-virtual {v2, v3, v5}, Landroidx/compose/material3/DatePickerDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    and-int v4, v4, p7

    .line 366
    .line 367
    move v10, v13

    .line 368
    move-object v13, v2

    .line 369
    move v2, v10

    .line 370
    move-object v10, v9

    .line 371
    goto :goto_10

    .line 372
    :goto_13
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 373
    .line 374
    .line 375
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    if-eqz v5, :cond_21

    .line 380
    .line 381
    const/4 v5, -0x1

    .line 382
    const-string v6, "androidx.compose.material3.DatePicker (DatePicker.kt:188)"

    .line 383
    .line 384
    const v7, 0x304311b5

    .line 385
    .line 386
    .line 387
    invoke-static {v7, v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 388
    .line 389
    .line 390
    :cond_21
    const/4 v5, 0x0

    .line 391
    invoke-static {v3, v5}, Landroidx/compose/material3/CalendarLocale_androidKt;->defaultLocale(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v7

    .line 403
    if-nez v6, :cond_22

    .line 404
    .line 405
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 406
    .line 407
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    if-ne v7, v6, :cond_23

    .line 412
    .line 413
    :cond_22
    invoke-static {v5}, Landroidx/compose/material3/internal/CalendarModel_androidKt;->createCalendarModel(Ljava/util/Locale;)Landroidx/compose/material3/internal/CalendarModel;

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    :cond_23
    check-cast v7, Landroidx/compose/material3/internal/CalendarModel;

    .line 421
    .line 422
    const v5, 0xf3bf580

    .line 423
    .line 424
    .line 425
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 426
    .line 427
    .line 428
    if-eqz v2, :cond_24

    .line 429
    .line 430
    new-instance v5, Landroidx/compose/material3/DatePickerKt$DatePicker$4;

    .line 431
    .line 432
    invoke-direct {v5, v1}, Landroidx/compose/material3/DatePickerKt$DatePicker$4;-><init>(Landroidx/compose/material3/DatePickerState;)V

    .line 433
    .line 434
    .line 435
    const v6, 0x76266147

    .line 436
    .line 437
    .line 438
    const/16 v12, 0x36

    .line 439
    .line 440
    invoke-static {v6, v15, v5, v3, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    :goto_14
    move-object v12, v5

    .line 445
    goto :goto_15

    .line 446
    :cond_24
    const/4 v5, 0x0

    .line 447
    goto :goto_14

    .line 448
    :goto_15
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 449
    .line 450
    .line 451
    sget-object v5, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 452
    .line 453
    invoke-virtual {v5}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getHeaderHeadlineFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    const/4 v14, 0x6

    .line 458
    invoke-static {v6, v3, v14}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    .line 459
    .line 460
    .line 461
    move-result-object v6

    .line 462
    invoke-virtual {v5}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getHeaderContainerHeight-D9Ej5fM()F

    .line 463
    .line 464
    .line 465
    move-result v5

    .line 466
    new-instance v14, Landroidx/compose/material3/DatePickerKt$DatePicker$5;

    .line 467
    .line 468
    invoke-direct {v14, v1, v7, v0, v13}, Landroidx/compose/material3/DatePickerKt$DatePicker$5;-><init>(Landroidx/compose/material3/DatePickerState;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;)V

    .line 469
    .line 470
    .line 471
    const v7, -0x6db7473a

    .line 472
    .line 473
    .line 474
    move-object/from16 v19, v0

    .line 475
    .line 476
    const/16 v0, 0x36

    .line 477
    .line 478
    invoke-static {v7, v15, v14, v3, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 479
    .line 480
    .line 481
    move-result-object v16

    .line 482
    shr-int/lit8 v0, v4, 0x3

    .line 483
    .line 484
    and-int/lit8 v0, v0, 0xe

    .line 485
    .line 486
    const/high16 v7, 0xd80000

    .line 487
    .line 488
    or-int/2addr v0, v7

    .line 489
    const/16 v18, 0x6

    .line 490
    .line 491
    shr-int/lit8 v4, v4, 0x6

    .line 492
    .line 493
    and-int/lit8 v7, v4, 0x70

    .line 494
    .line 495
    or-int/2addr v0, v7

    .line 496
    and-int/lit16 v7, v4, 0x380

    .line 497
    .line 498
    or-int/2addr v0, v7

    .line 499
    const v7, 0xe000

    .line 500
    .line 501
    .line 502
    and-int/2addr v4, v7

    .line 503
    or-int v18, v0, v4

    .line 504
    .line 505
    move-object/from16 v17, v3

    .line 506
    .line 507
    move v15, v5

    .line 508
    move-object v14, v6

    .line 509
    invoke-static/range {v9 .. v18}, Landroidx/compose/material3/DatePickerKt;->DateEntryContainer-au3_HiA(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 510
    .line 511
    .line 512
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-eqz v0, :cond_25

    .line 517
    .line 518
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 519
    .line 520
    .line 521
    :cond_25
    move v6, v2

    .line 522
    move-object v2, v9

    .line 523
    move-object v4, v10

    .line 524
    move-object v7, v13

    .line 525
    move-object/from16 v3, v19

    .line 526
    .line 527
    goto/16 :goto_e

    .line 528
    .line 529
    :goto_16
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 530
    .line 531
    .line 532
    move-result-object v10

    .line 533
    if-eqz v10, :cond_26

    .line 534
    .line 535
    new-instance v0, Landroidx/compose/material3/DatePickerKt$DatePicker$6;

    .line 536
    .line 537
    move/from16 v9, p9

    .line 538
    .line 539
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/DatePickerKt$DatePicker$6;-><init>(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lr6/e;Lr6/e;ZLandroidx/compose/material3/DatePickerColors;II)V

    .line 540
    .line 541
    .line 542
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 543
    .line 544
    .line 545
    :cond_26
    return-void
.end method

.method private static final DatePickerContent(Ljava/lang/Long;JLr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 31
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "J",
            "Lr6/c;",
            "Lr6/c;",
            "Landroidx/compose/material3/internal/CalendarModel;",
            "Lx6/f;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-wide/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v6, p5

    .line 4
    .line 5
    move-object/from16 v7, p6

    .line 6
    .line 7
    move-object/from16 v8, p7

    .line 8
    .line 9
    move-object/from16 v10, p9

    .line 10
    .line 11
    move/from16 v0, p11

    .line 12
    .line 13
    const v3, -0x19e570ba

    .line 14
    .line 15
    .line 16
    move-object/from16 v4, p10

    .line 17
    .line 18
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    .line 21
    move-result-object v12

    .line 22
    and-int/lit8 v4, v0, 0x6

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    move-object/from16 v4, p0

    .line 27
    .line 28
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    if-eqz v9, :cond_0

    .line 33
    .line 34
    const/4 v9, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v9, 0x2

    .line 37
    :goto_0
    or-int/2addr v9, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object/from16 v4, p0

    .line 40
    .line 41
    move v9, v0

    .line 42
    :goto_1
    and-int/lit8 v11, v0, 0x30

    .line 43
    .line 44
    if-nez v11, :cond_3

    .line 45
    .line 46
    invoke-interface {v12, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    if-eqz v11, :cond_2

    .line 51
    .line 52
    const/16 v11, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v11, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v9, v11

    .line 58
    :cond_3
    and-int/lit16 v11, v0, 0x180

    .line 59
    .line 60
    if-nez v11, :cond_5

    .line 61
    .line 62
    move-object/from16 v11, p3

    .line 63
    .line 64
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v13

    .line 68
    if-eqz v13, :cond_4

    .line 69
    .line 70
    const/16 v13, 0x100

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const/16 v13, 0x80

    .line 74
    .line 75
    :goto_3
    or-int/2addr v9, v13

    .line 76
    goto :goto_4

    .line 77
    :cond_5
    move-object/from16 v11, p3

    .line 78
    .line 79
    :goto_4
    and-int/lit16 v13, v0, 0xc00

    .line 80
    .line 81
    if-nez v13, :cond_7

    .line 82
    .line 83
    move-object/from16 v13, p4

    .line 84
    .line 85
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    if-eqz v14, :cond_6

    .line 90
    .line 91
    const/16 v14, 0x800

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_6
    const/16 v14, 0x400

    .line 95
    .line 96
    :goto_5
    or-int/2addr v9, v14

    .line 97
    goto :goto_6

    .line 98
    :cond_7
    move-object/from16 v13, p4

    .line 99
    .line 100
    :goto_6
    and-int/lit16 v14, v0, 0x6000

    .line 101
    .line 102
    if-nez v14, :cond_9

    .line 103
    .line 104
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v14

    .line 108
    if-eqz v14, :cond_8

    .line 109
    .line 110
    const/16 v14, 0x4000

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_8
    const/16 v14, 0x2000

    .line 114
    .line 115
    :goto_7
    or-int/2addr v9, v14

    .line 116
    :cond_9
    const/high16 v14, 0x30000

    .line 117
    .line 118
    and-int/2addr v14, v0

    .line 119
    if-nez v14, :cond_b

    .line 120
    .line 121
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    if-eqz v14, :cond_a

    .line 126
    .line 127
    const/high16 v14, 0x20000

    .line 128
    .line 129
    goto :goto_8

    .line 130
    :cond_a
    const/high16 v14, 0x10000

    .line 131
    .line 132
    :goto_8
    or-int/2addr v9, v14

    .line 133
    :cond_b
    const/high16 v14, 0x180000

    .line 134
    .line 135
    and-int/2addr v14, v0

    .line 136
    if-nez v14, :cond_e

    .line 137
    .line 138
    const/high16 v14, 0x200000

    .line 139
    .line 140
    and-int/2addr v14, v0

    .line 141
    if-nez v14, :cond_c

    .line 142
    .line 143
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    goto :goto_9

    .line 148
    :cond_c
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    :goto_9
    if-eqz v14, :cond_d

    .line 153
    .line 154
    const/high16 v14, 0x100000

    .line 155
    .line 156
    goto :goto_a

    .line 157
    :cond_d
    const/high16 v14, 0x80000

    .line 158
    .line 159
    :goto_a
    or-int/2addr v9, v14

    .line 160
    :cond_e
    const/high16 v14, 0xc00000

    .line 161
    .line 162
    and-int/2addr v14, v0

    .line 163
    if-nez v14, :cond_10

    .line 164
    .line 165
    move-object/from16 v14, p8

    .line 166
    .line 167
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    if-eqz v15, :cond_f

    .line 172
    .line 173
    const/high16 v15, 0x800000

    .line 174
    .line 175
    goto :goto_b

    .line 176
    :cond_f
    const/high16 v15, 0x400000

    .line 177
    .line 178
    :goto_b
    or-int/2addr v9, v15

    .line 179
    goto :goto_c

    .line 180
    :cond_10
    move-object/from16 v14, p8

    .line 181
    .line 182
    :goto_c
    const/high16 v15, 0x6000000

    .line 183
    .line 184
    and-int/2addr v15, v0

    .line 185
    if-nez v15, :cond_12

    .line 186
    .line 187
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v15

    .line 191
    if-eqz v15, :cond_11

    .line 192
    .line 193
    const/high16 v15, 0x4000000

    .line 194
    .line 195
    goto :goto_d

    .line 196
    :cond_11
    const/high16 v15, 0x2000000

    .line 197
    .line 198
    :goto_d
    or-int/2addr v9, v15

    .line 199
    :cond_12
    const v15, 0x2492493

    .line 200
    .line 201
    .line 202
    and-int/2addr v15, v9

    .line 203
    const v5, 0x2492492

    .line 204
    .line 205
    .line 206
    if-ne v15, v5, :cond_14

    .line 207
    .line 208
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-nez v5, :cond_13

    .line 213
    .line 214
    goto :goto_e

    .line 215
    :cond_13
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 216
    .line 217
    .line 218
    goto/16 :goto_15

    .line 219
    .line 220
    :cond_14
    :goto_e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_15

    .line 225
    .line 226
    const/4 v5, -0x1

    .line 227
    const-string v15, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1491)"

    .line 228
    .line 229
    invoke-static {v3, v9, v5, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :cond_15
    invoke-virtual {v6, v1, v2}, Landroidx/compose/material3/internal/CalendarModel;->getMonth(J)Landroidx/compose/material3/internal/CalendarMonth;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-virtual {v3, v7}, Landroidx/compose/material3/internal/CalendarMonth;->indexIn(Lx6/f;)I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    const/4 v15, 0x0

    .line 241
    if-gez v5, :cond_16

    .line 242
    .line 243
    move v5, v15

    .line 244
    :cond_16
    move-object/from16 v20, v3

    .line 245
    .line 246
    const/4 v0, 0x2

    .line 247
    invoke-static {v5, v15, v12, v15, v0}, Landroidx/compose/foundation/lazy/LazyListStateKt;->rememberLazyListState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v16

    .line 259
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 260
    .line 261
    .line 262
    move-result v17

    .line 263
    or-int v16, v16, v17

    .line 264
    .line 265
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    if-nez v16, :cond_18

    .line 270
    .line 271
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 272
    .line 273
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v13

    .line 277
    if-ne v15, v13, :cond_17

    .line 278
    .line 279
    goto :goto_f

    .line 280
    :cond_17
    const/4 v13, 0x0

    .line 281
    goto :goto_10

    .line 282
    :cond_18
    :goto_f
    new-instance v15, Landroidx/compose/material3/DatePickerKt$DatePickerContent$1$1;

    .line 283
    .line 284
    const/4 v13, 0x0

    .line 285
    invoke-direct {v15, v3, v5, v13}, Landroidx/compose/material3/DatePickerKt$DatePickerContent$1$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;ILh6/c;)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :goto_10
    check-cast v15, Lr6/e;

    .line 292
    .line 293
    const/4 v5, 0x0

    .line 294
    invoke-static {v0, v15, v12, v5}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 302
    .line 303
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v15

    .line 307
    if-ne v0, v15, :cond_19

    .line 308
    .line 309
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 310
    .line 311
    invoke-static {v0, v12}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lh6/h;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/v;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    new-instance v15, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 316
    .line 317
    invoke-direct {v15, v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/v;)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    move-object v0, v15

    .line 324
    :cond_19
    check-cast v0, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 325
    .line 326
    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/v;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    const/4 v15, 0x0

    .line 331
    new-array v11, v15, [Ljava/lang/Object;

    .line 332
    .line 333
    sget-object v14, Landroidx/compose/material3/DatePickerKt$DatePickerContent$yearPickerVisible$2;->INSTANCE:Landroidx/compose/material3/DatePickerKt$DatePickerContent$yearPickerVisible$2;

    .line 334
    .line 335
    const/16 v16, 0xc00

    .line 336
    .line 337
    const/16 v17, 0x6

    .line 338
    .line 339
    move-object/from16 v18, v12

    .line 340
    .line 341
    const/4 v12, 0x0

    .line 342
    move-object/from16 v19, v13

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    move v2, v15

    .line 346
    move-object/from16 v15, v18

    .line 347
    .line 348
    move-object/from16 v1, v19

    .line 349
    .line 350
    invoke-static/range {v11 .. v17}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    move-object v12, v15

    .line 355
    check-cast v11, Landroidx/compose/runtime/MutableState;

    .line 356
    .line 357
    invoke-static {v12, v2}, Landroidx/compose/material3/CalendarLocale_androidKt;->defaultLocale(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;

    .line 358
    .line 359
    .line 360
    move-result-object v13

    .line 361
    sget-object v14, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 362
    .line 363
    sget-object v21, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 364
    .line 365
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 366
    .line 367
    .line 368
    move-result-object v15

    .line 369
    sget-object v22, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 370
    .line 371
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-static {v15, v1, v12, v2}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-static {v12, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 380
    .line 381
    .line 382
    move-result v15

    .line 383
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    invoke-static {v12, v14}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    move-object/from16 v16, v5

    .line 392
    .line 393
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 394
    .line 395
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 396
    .line 397
    .line 398
    move-result-object v7

    .line 399
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 400
    .line 401
    .line 402
    move-result-object v17

    .line 403
    if-nez v17, :cond_1a

    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 406
    .line 407
    .line 408
    :cond_1a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 409
    .line 410
    .line 411
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 412
    .line 413
    .line 414
    move-result v17

    .line 415
    if-eqz v17, :cond_1b

    .line 416
    .line 417
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 418
    .line 419
    .line 420
    goto :goto_11

    .line 421
    :cond_1b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 422
    .line 423
    .line 424
    :goto_11
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    invoke-static {v5, v7, v1, v7, v2}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-nez v2, :cond_1c

    .line 437
    .line 438
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    move/from16 v17, v9

    .line 443
    .line 444
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 445
    .line 446
    .line 447
    move-result-object v9

    .line 448
    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    if-nez v2, :cond_1d

    .line 453
    .line 454
    goto :goto_12

    .line 455
    :cond_1c
    move/from16 v17, v9

    .line 456
    .line 457
    :goto_12
    invoke-static {v15, v7, v15, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 458
    .line 459
    .line 460
    :cond_1d
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-static {v7, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 465
    .line 466
    .line 467
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 468
    .line 469
    sget v1, Landroidx/compose/material3/DatePickerKt;->DatePickerHorizontalPadding:F

    .line 470
    .line 471
    const/4 v2, 0x0

    .line 472
    const/4 v4, 0x2

    .line 473
    const/4 v7, 0x0

    .line 474
    invoke-static {v14, v1, v2, v4, v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListState;->getCanScrollForward()Z

    .line 479
    .line 480
    .line 481
    move-result v10

    .line 482
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListState;->getCanScrollBackward()Z

    .line 483
    .line 484
    .line 485
    move-result v4

    .line 486
    invoke-static {v11}, Landroidx/compose/material3/DatePickerKt;->DatePickerContent$lambda$10(Landroidx/compose/runtime/MutableState;)Z

    .line 487
    .line 488
    .line 489
    move-result v7

    .line 490
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 491
    .line 492
    .line 493
    move-result-object v15

    .line 494
    invoke-interface {v8, v15, v13}, Landroidx/compose/material3/DatePickerFormatter;->formatMonthYear(Ljava/lang/Long;Ljava/util/Locale;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v13

    .line 498
    if-nez v13, :cond_1e

    .line 499
    .line 500
    const-string v13, "-"

    .line 501
    .line 502
    :cond_1e
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v15

    .line 506
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v18

    .line 510
    or-int v15, v15, v18

    .line 511
    .line 512
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    if-nez v15, :cond_1f

    .line 517
    .line 518
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v15

    .line 522
    if-ne v2, v15, :cond_20

    .line 523
    .line 524
    :cond_1f
    new-instance v2, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$1$1;

    .line 525
    .line 526
    invoke-direct {v2, v0, v3}, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$1$1;-><init>(Lkotlinx/coroutines/v;Landroidx/compose/foundation/lazy/LazyListState;)V

    .line 527
    .line 528
    .line 529
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    :cond_20
    check-cast v2, Lr6/a;

    .line 533
    .line 534
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v15

    .line 538
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v18

    .line 542
    or-int v15, v15, v18

    .line 543
    .line 544
    move-object/from16 v18, v2

    .line 545
    .line 546
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    if-nez v15, :cond_21

    .line 551
    .line 552
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v15

    .line 556
    if-ne v2, v15, :cond_22

    .line 557
    .line 558
    :cond_21
    new-instance v2, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$2$1;

    .line 559
    .line 560
    invoke-direct {v2, v0, v3}, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$2$1;-><init>(Lkotlinx/coroutines/v;Landroidx/compose/foundation/lazy/LazyListState;)V

    .line 561
    .line 562
    .line 563
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    :cond_22
    move-object v15, v2

    .line 567
    check-cast v15, Lr6/a;

    .line 568
    .line 569
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    move-object/from16 v23, v0

    .line 574
    .line 575
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    if-nez v2, :cond_23

    .line 580
    .line 581
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    if-ne v0, v2, :cond_24

    .line 586
    .line 587
    :cond_23
    new-instance v0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$3$1;

    .line 588
    .line 589
    invoke-direct {v0, v11}, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$3$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 590
    .line 591
    .line 592
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    :cond_24
    move-object/from16 v16, v0

    .line 596
    .line 597
    check-cast v16, Lr6/a;

    .line 598
    .line 599
    const/high16 v0, 0xe000000

    .line 600
    .line 601
    and-int v0, v17, v0

    .line 602
    .line 603
    or-int/lit8 v19, v0, 0x6

    .line 604
    .line 605
    move-object/from16 v24, v11

    .line 606
    .line 607
    move/from16 v2, v17

    .line 608
    .line 609
    move-object/from16 v17, p9

    .line 610
    .line 611
    move v11, v4

    .line 612
    move-object v4, v14

    .line 613
    move-object/from16 v14, v18

    .line 614
    .line 615
    move-object/from16 v18, v12

    .line 616
    .line 617
    move v12, v7

    .line 618
    invoke-static/range {v9 .. v19}, Landroidx/compose/material3/DatePickerKt;->MonthsNavigation(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 619
    .line 620
    .line 621
    move-object/from16 v10, v17

    .line 622
    .line 623
    move-object/from16 v12, v18

    .line 624
    .line 625
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 626
    .line 627
    .line 628
    move-result-object v7

    .line 629
    const/4 v15, 0x0

    .line 630
    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 631
    .line 632
    .line 633
    move-result-object v7

    .line 634
    invoke-static {v12, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 635
    .line 636
    .line 637
    move-result v9

    .line 638
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 639
    .line 640
    .line 641
    move-result-object v11

    .line 642
    invoke-static {v12, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 643
    .line 644
    .line 645
    move-result-object v13

    .line 646
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 647
    .line 648
    .line 649
    move-result-object v14

    .line 650
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 651
    .line 652
    .line 653
    move-result-object v15

    .line 654
    if-nez v15, :cond_25

    .line 655
    .line 656
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 657
    .line 658
    .line 659
    :cond_25
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 660
    .line 661
    .line 662
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 663
    .line 664
    .line 665
    move-result v15

    .line 666
    if-eqz v15, :cond_26

    .line 667
    .line 668
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 669
    .line 670
    .line 671
    goto :goto_13

    .line 672
    :cond_26
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 673
    .line 674
    .line 675
    :goto_13
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 676
    .line 677
    .line 678
    move-result-object v14

    .line 679
    invoke-static {v5, v14, v7, v14, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 680
    .line 681
    .line 682
    move-result-object v7

    .line 683
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 684
    .line 685
    .line 686
    move-result v11

    .line 687
    if-nez v11, :cond_27

    .line 688
    .line 689
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v11

    .line 693
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 694
    .line 695
    .line 696
    move-result-object v15

    .line 697
    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v11

    .line 701
    if-nez v11, :cond_28

    .line 702
    .line 703
    :cond_27
    invoke-static {v9, v14, v9, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 704
    .line 705
    .line 706
    :cond_28
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 707
    .line 708
    .line 709
    move-result-object v7

    .line 710
    invoke-static {v14, v13, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 711
    .line 712
    .line 713
    sget-object v7, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 714
    .line 715
    const/4 v7, 0x0

    .line 716
    const/4 v9, 0x2

    .line 717
    const/4 v13, 0x0

    .line 718
    invoke-static {v4, v1, v7, v9, v13}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 723
    .line 724
    .line 725
    move-result-object v7

    .line 726
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 727
    .line 728
    .line 729
    move-result-object v9

    .line 730
    const/4 v15, 0x0

    .line 731
    invoke-static {v7, v9, v12, v15}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 732
    .line 733
    .line 734
    move-result-object v7

    .line 735
    invoke-static {v12, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 736
    .line 737
    .line 738
    move-result v9

    .line 739
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 740
    .line 741
    .line 742
    move-result-object v11

    .line 743
    invoke-static {v12, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 744
    .line 745
    .line 746
    move-result-object v1

    .line 747
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 748
    .line 749
    .line 750
    move-result-object v13

    .line 751
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 752
    .line 753
    .line 754
    move-result-object v14

    .line 755
    if-nez v14, :cond_29

    .line 756
    .line 757
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 758
    .line 759
    .line 760
    :cond_29
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 761
    .line 762
    .line 763
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 764
    .line 765
    .line 766
    move-result v14

    .line 767
    if-eqz v14, :cond_2a

    .line 768
    .line 769
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 770
    .line 771
    .line 772
    goto :goto_14

    .line 773
    :cond_2a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 774
    .line 775
    .line 776
    :goto_14
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 777
    .line 778
    .line 779
    move-result-object v13

    .line 780
    invoke-static {v5, v13, v7, v13, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 781
    .line 782
    .line 783
    move-result-object v7

    .line 784
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 785
    .line 786
    .line 787
    move-result v11

    .line 788
    if-nez v11, :cond_2b

    .line 789
    .line 790
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v11

    .line 794
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 795
    .line 796
    .line 797
    move-result-object v14

    .line 798
    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v11

    .line 802
    if-nez v11, :cond_2c

    .line 803
    .line 804
    :cond_2b
    invoke-static {v9, v13, v9, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 805
    .line 806
    .line 807
    :cond_2c
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 808
    .line 809
    .line 810
    move-result-object v5

    .line 811
    invoke-static {v13, v1, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 812
    .line 813
    .line 814
    shr-int/lit8 v1, v2, 0x18

    .line 815
    .line 816
    and-int/lit8 v1, v1, 0xe

    .line 817
    .line 818
    shr-int/lit8 v5, v2, 0x9

    .line 819
    .line 820
    and-int/lit8 v5, v5, 0x70

    .line 821
    .line 822
    or-int/2addr v1, v5

    .line 823
    invoke-static {v10, v6, v12, v1}, Landroidx/compose/material3/DatePickerKt;->WeekDays(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/runtime/Composer;I)V

    .line 824
    .line 825
    .line 826
    shl-int/lit8 v1, v2, 0x3

    .line 827
    .line 828
    and-int/lit8 v1, v1, 0x70

    .line 829
    .line 830
    and-int/lit16 v5, v2, 0x380

    .line 831
    .line 832
    or-int/2addr v1, v5

    .line 833
    and-int/lit16 v5, v2, 0x1c00

    .line 834
    .line 835
    or-int/2addr v1, v5

    .line 836
    const v5, 0xe000

    .line 837
    .line 838
    .line 839
    and-int/2addr v5, v2

    .line 840
    or-int/2addr v1, v5

    .line 841
    const/high16 v5, 0x70000

    .line 842
    .line 843
    and-int/2addr v5, v2

    .line 844
    or-int/2addr v1, v5

    .line 845
    const/high16 v5, 0x380000

    .line 846
    .line 847
    and-int/2addr v5, v2

    .line 848
    or-int/2addr v1, v5

    .line 849
    const/high16 v5, 0x1c00000

    .line 850
    .line 851
    and-int/2addr v2, v5

    .line 852
    or-int/2addr v1, v2

    .line 853
    or-int v13, v1, v0

    .line 854
    .line 855
    move-object/from16 v5, p3

    .line 856
    .line 857
    move-object v0, v4

    .line 858
    move-object v7, v6

    .line 859
    move-object v9, v8

    .line 860
    move-object v11, v10

    .line 861
    move-object/from16 v4, p0

    .line 862
    .line 863
    move-object/from16 v6, p4

    .line 864
    .line 865
    move-object/from16 v8, p6

    .line 866
    .line 867
    move-object/from16 v10, p8

    .line 868
    .line 869
    invoke-static/range {v3 .. v13}, Landroidx/compose/material3/DatePickerKt;->HorizontalMonthsList(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 870
    .line 871
    .line 872
    move-object v5, v3

    .line 873
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 874
    .line 875
    .line 876
    invoke-static/range {v24 .. v24}, Landroidx/compose/material3/DatePickerKt;->DatePickerContent$lambda$10(Landroidx/compose/runtime/MutableState;)Z

    .line 877
    .line 878
    .line 879
    move-result v11

    .line 880
    invoke-static {v0}, Landroidx/compose/ui/draw/ClipKt;->clipToBounds(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 881
    .line 882
    .line 883
    move-result-object v13

    .line 884
    const/16 v18, 0xf

    .line 885
    .line 886
    const/16 v19, 0x0

    .line 887
    .line 888
    const/4 v14, 0x0

    .line 889
    const/4 v15, 0x0

    .line 890
    const/16 v16, 0x0

    .line 891
    .line 892
    const/16 v17, 0x0

    .line 893
    .line 894
    invoke-static/range {v14 .. v19}, Landroidx/compose/animation/EnterExitTransitionKt;->expandVertically$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLr6/c;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    const v1, 0x3f19999a    # 0.6f

    .line 899
    .line 900
    .line 901
    const/4 v14, 0x1

    .line 902
    const/4 v7, 0x0

    .line 903
    invoke-static {v7, v1, v14, v7}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-virtual {v0, v1}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    .line 908
    .line 909
    .line 910
    move-result-object v15

    .line 911
    const/16 v29, 0xf

    .line 912
    .line 913
    const/16 v30, 0x0

    .line 914
    .line 915
    const/16 v25, 0x0

    .line 916
    .line 917
    const/16 v26, 0x0

    .line 918
    .line 919
    const/16 v27, 0x0

    .line 920
    .line 921
    const/16 v28, 0x0

    .line 922
    .line 923
    invoke-static/range {v25 .. v30}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkVertically$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLr6/c;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    const/4 v1, 0x3

    .line 928
    const/4 v2, 0x0

    .line 929
    invoke-static {v7, v2, v1, v7}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    invoke-virtual {v0, v1}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    .line 934
    .line 935
    .line 936
    move-result-object v16

    .line 937
    new-instance v0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2;

    .line 938
    .line 939
    move-wide/from16 v1, p1

    .line 940
    .line 941
    move-object/from16 v9, p5

    .line 942
    .line 943
    move-object/from16 v6, p6

    .line 944
    .line 945
    move-object/from16 v8, p8

    .line 946
    .line 947
    move-object/from16 v10, p9

    .line 948
    .line 949
    move-object/from16 v7, v20

    .line 950
    .line 951
    move-object/from16 v4, v23

    .line 952
    .line 953
    move-object/from16 v3, v24

    .line 954
    .line 955
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2;-><init>(JLandroidx/compose/runtime/MutableState;Lkotlinx/coroutines/v;Landroidx/compose/foundation/lazy/LazyListState;Lx6/f;Landroidx/compose/material3/internal/CalendarMonth;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/material3/DatePickerColors;)V

    .line 956
    .line 957
    .line 958
    const/16 v1, 0x36

    .line 959
    .line 960
    const v2, 0x4726a972

    .line 961
    .line 962
    .line 963
    invoke-static {v2, v14, v0, v12, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 964
    .line 965
    .line 966
    move-result-object v9

    .line 967
    move v4, v11

    .line 968
    const v11, 0x30db0

    .line 969
    .line 970
    .line 971
    move-object/from16 v18, v12

    .line 972
    .line 973
    const/16 v12, 0x10

    .line 974
    .line 975
    const/4 v8, 0x0

    .line 976
    move-object v5, v13

    .line 977
    move-object v6, v15

    .line 978
    move-object/from16 v7, v16

    .line 979
    .line 980
    move-object/from16 v10, v18

    .line 981
    .line 982
    invoke-static/range {v4 .. v12}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 983
    .line 984
    .line 985
    move-object v12, v10

    .line 986
    invoke-static {v12}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 987
    .line 988
    .line 989
    move-result v0

    .line 990
    if-eqz v0, :cond_2d

    .line 991
    .line 992
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 993
    .line 994
    .line 995
    :cond_2d
    :goto_15
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 996
    .line 997
    .line 998
    move-result-object v12

    .line 999
    if-eqz v12, :cond_2e

    .line 1000
    .line 1001
    new-instance v0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$3;

    .line 1002
    .line 1003
    move-object/from16 v1, p0

    .line 1004
    .line 1005
    move-wide/from16 v2, p1

    .line 1006
    .line 1007
    move-object/from16 v4, p3

    .line 1008
    .line 1009
    move-object/from16 v5, p4

    .line 1010
    .line 1011
    move-object/from16 v6, p5

    .line 1012
    .line 1013
    move-object/from16 v7, p6

    .line 1014
    .line 1015
    move-object/from16 v8, p7

    .line 1016
    .line 1017
    move-object/from16 v9, p8

    .line 1018
    .line 1019
    move-object/from16 v10, p9

    .line 1020
    .line 1021
    move/from16 v11, p11

    .line 1022
    .line 1023
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/DatePickerKt$DatePickerContent$3;-><init>(Ljava/lang/Long;JLr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;I)V

    .line 1024
    .line 1025
    .line 1026
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1027
    .line 1028
    .line 1029
    :cond_2e
    return-void
.end method

.method private static final DatePickerContent$lambda$10(Landroidx/compose/runtime/MutableState;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final DatePickerContent$lambda$11(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final DatePickerHeader-pc5RIQQ(Landroidx/compose/ui/Modifier;Lr6/e;JJFLr6/e;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lr6/e;",
            "JJF",
            "Lr6/e;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v7, p6

    .line 6
    .line 7
    move-object/from16 v8, p7

    .line 8
    .line 9
    move/from16 v9, p9

    .line 10
    .line 11
    const v0, -0x3b5e5457

    .line 12
    .line 13
    .line 14
    move-object/from16 v3, p8

    .line 15
    .line 16
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v14

    .line 20
    and-int/lit8 v3, v9, 0x6

    .line 21
    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v3, 0x2

    .line 33
    :goto_0
    or-int/2addr v3, v9

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v3, v9

    .line 36
    :goto_1
    and-int/lit8 v4, v9, 0x30

    .line 37
    .line 38
    if-nez v4, :cond_3

    .line 39
    .line 40
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    const/16 v4, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v4, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v3, v4

    .line 52
    :cond_3
    and-int/lit16 v4, v9, 0x180

    .line 53
    .line 54
    move-wide/from16 v10, p2

    .line 55
    .line 56
    if-nez v4, :cond_5

    .line 57
    .line 58
    invoke-interface {v14, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    const/16 v4, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v4, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v3, v4

    .line 70
    :cond_5
    and-int/lit16 v4, v9, 0xc00

    .line 71
    .line 72
    move-wide/from16 v5, p4

    .line 73
    .line 74
    if-nez v4, :cond_7

    .line 75
    .line 76
    invoke-interface {v14, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_6

    .line 81
    .line 82
    const/16 v4, 0x800

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    const/16 v4, 0x400

    .line 86
    .line 87
    :goto_4
    or-int/2addr v3, v4

    .line 88
    :cond_7
    and-int/lit16 v4, v9, 0x6000

    .line 89
    .line 90
    if-nez v4, :cond_9

    .line 91
    .line 92
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_8

    .line 97
    .line 98
    const/16 v4, 0x4000

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_8
    const/16 v4, 0x2000

    .line 102
    .line 103
    :goto_5
    or-int/2addr v3, v4

    .line 104
    :cond_9
    const/high16 v4, 0x30000

    .line 105
    .line 106
    and-int/2addr v4, v9

    .line 107
    if-nez v4, :cond_b

    .line 108
    .line 109
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_a

    .line 114
    .line 115
    const/high16 v4, 0x20000

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_a
    const/high16 v4, 0x10000

    .line 119
    .line 120
    :goto_6
    or-int/2addr v3, v4

    .line 121
    :cond_b
    const v4, 0x12493

    .line 122
    .line 123
    .line 124
    and-int/2addr v4, v3

    .line 125
    const v12, 0x12492

    .line 126
    .line 127
    .line 128
    if-ne v4, v12, :cond_d

    .line 129
    .line 130
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_c

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_c
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_b

    .line 141
    .line 142
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_e

    .line 147
    .line 148
    const/4 v4, -0x1

    .line 149
    const-string v12, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1621)"

    .line 150
    .line 151
    invoke-static {v0, v3, v4, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_e
    const/4 v0, 0x0

    .line 155
    const/4 v4, 0x0

    .line 156
    const/4 v12, 0x1

    .line 157
    if-eqz v2, :cond_f

    .line 158
    .line 159
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 160
    .line 161
    invoke-static {v13, v4, v7, v12, v0}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    goto :goto_8

    .line 166
    :cond_f
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 167
    .line 168
    :goto_8
    invoke-static {v1, v4, v12, v0}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-interface {v0, v13}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 177
    .line 178
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    sget-object v13, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 183
    .line 184
    invoke-virtual {v13}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    const/4 v15, 0x6

    .line 189
    invoke-static {v4, v13, v14, v15}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    const/4 v13, 0x0

    .line 194
    invoke-static {v14, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    invoke-static {v14, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 207
    .line 208
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 213
    .line 214
    .line 215
    move-result-object v16

    .line 216
    if-nez v16, :cond_10

    .line 217
    .line 218
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 219
    .line 220
    .line 221
    :cond_10
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 222
    .line 223
    .line 224
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 225
    .line 226
    .line 227
    move-result v16

    .line 228
    if-eqz v16, :cond_11

    .line 229
    .line 230
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 231
    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_11
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 235
    .line 236
    .line 237
    :goto_9
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-static {v15, v1, v4, v1, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 246
    .line 247
    .line 248
    move-result v12

    .line 249
    if-nez v12, :cond_12

    .line 250
    .line 251
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v12

    .line 255
    move/from16 v16, v3

    .line 256
    .line 257
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-nez v3, :cond_13

    .line 266
    .line 267
    goto :goto_a

    .line 268
    :cond_12
    move/from16 v16, v3

    .line 269
    .line 270
    :goto_a
    invoke-static {v13, v1, v13, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 271
    .line 272
    .line 273
    :cond_13
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-static {v1, v0, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 278
    .line 279
    .line 280
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 281
    .line 282
    const v0, 0x236cb056

    .line 283
    .line 284
    .line 285
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 286
    .line 287
    .line 288
    if-eqz v2, :cond_14

    .line 289
    .line 290
    sget-object v0, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 291
    .line 292
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getHeaderSupportingTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    const/4 v1, 0x6

    .line 297
    invoke-static {v0, v14, v1}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    .line 298
    .line 299
    .line 300
    move-result-object v12

    .line 301
    new-instance v0, Landroidx/compose/material3/DatePickerKt$DatePickerHeader$1$1;

    .line 302
    .line 303
    invoke-direct {v0, v2}, Landroidx/compose/material3/DatePickerKt$DatePickerHeader$1$1;-><init>(Lr6/e;)V

    .line 304
    .line 305
    .line 306
    const/16 v1, 0x36

    .line 307
    .line 308
    const v3, 0x73691ce2

    .line 309
    .line 310
    .line 311
    const/4 v4, 0x1

    .line 312
    invoke-static {v3, v4, v0, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 313
    .line 314
    .line 315
    move-result-object v13

    .line 316
    shr-int/lit8 v0, v16, 0x6

    .line 317
    .line 318
    and-int/lit8 v0, v0, 0xe

    .line 319
    .line 320
    or-int/lit16 v15, v0, 0x180

    .line 321
    .line 322
    invoke-static/range {v10 .. v15}, Landroidx/compose/material3/internal/ProvideContentColorTextStyleKt;->ProvideContentColorTextStyle-3J-VO9M(JLandroidx/compose/ui/text/TextStyle;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 323
    .line 324
    .line 325
    :cond_14
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 326
    .line 327
    .line 328
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    sget v1, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    .line 341
    .line 342
    shr-int/lit8 v3, v16, 0xc

    .line 343
    .line 344
    and-int/lit8 v3, v3, 0x70

    .line 345
    .line 346
    or-int/2addr v1, v3

    .line 347
    invoke-static {v0, v8, v14, v1}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 348
    .line 349
    .line 350
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 351
    .line 352
    .line 353
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_15

    .line 358
    .line 359
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 360
    .line 361
    .line 362
    :cond_15
    :goto_b
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    if-eqz v10, :cond_16

    .line 367
    .line 368
    new-instance v0, Landroidx/compose/material3/DatePickerKt$DatePickerHeader$2;

    .line 369
    .line 370
    move-object/from16 v1, p0

    .line 371
    .line 372
    move-wide/from16 v3, p2

    .line 373
    .line 374
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/DatePickerKt$DatePickerHeader$2;-><init>(Landroidx/compose/ui/Modifier;Lr6/e;JJFLr6/e;I)V

    .line 375
    .line 376
    .line 377
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 378
    .line 379
    .line 380
    :cond_16
    return-void
.end method

.method public static final DatePickerState-sHin3Bw(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DatePickerState;
    .locals 8
    .param p0    # Ljava/util/Locale;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lx6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/material3/SelectableDates;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material3/DatePickerStateImpl;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    move-object v6, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/DatePickerStateImpl;-><init>(Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/e;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static synthetic DatePickerState-sHin3Bw$default(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;ILjava/lang/Object;)Landroidx/compose/material3/DatePickerState;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p7, p6, 0x4

    .line 7
    .line 8
    if-eqz p7, :cond_1

    .line 9
    .line 10
    move-object p2, p1

    .line 11
    :cond_1
    and-int/lit8 p7, p6, 0x8

    .line 12
    .line 13
    if-eqz p7, :cond_2

    .line 14
    .line 15
    sget-object p3, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 16
    .line 17
    invoke-virtual {p3}, Landroidx/compose/material3/DatePickerDefaults;->getYearRange()Lx6/f;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    :cond_2
    and-int/lit8 p7, p6, 0x10

    .line 22
    .line 23
    if-eqz p7, :cond_3

    .line 24
    .line 25
    sget-object p4, Landroidx/compose/material3/DisplayMode;->Companion:Landroidx/compose/material3/DisplayMode$Companion;

    .line 26
    .line 27
    invoke-virtual {p4}, Landroidx/compose/material3/DisplayMode$Companion;->getPicker-jFl-4v0()I

    .line 28
    .line 29
    .line 30
    move-result p4

    .line 31
    :cond_3
    and-int/lit8 p6, p6, 0x20

    .line 32
    .line 33
    if-eqz p6, :cond_4

    .line 34
    .line 35
    sget-object p5, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 36
    .line 37
    invoke-virtual {p5}, Landroidx/compose/material3/DatePickerDefaults;->getAllDates()Landroidx/compose/material3/SelectableDates;

    .line 38
    .line 39
    .line 40
    move-result-object p5

    .line 41
    :cond_4
    move p6, p4

    .line 42
    move-object p7, p5

    .line 43
    move-object p4, p2

    .line 44
    move-object p5, p3

    .line 45
    move-object p2, p0

    .line 46
    move-object p3, p1

    .line 47
    invoke-static/range {p2 .. p7}, Landroidx/compose/material3/DatePickerKt;->DatePickerState-sHin3Bw(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DatePickerState;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method private static final Day(Landroidx/compose/ui/Modifier;ZLr6/a;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lr6/a;",
            "ZZZZ",
            "Ljava/lang/String;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Lr6/e;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p5

    .line 6
    .line 7
    move-object/from16 v9, p7

    .line 8
    .line 9
    move-object/from16 v10, p9

    .line 10
    .line 11
    move/from16 v11, p11

    .line 12
    .line 13
    const v3, -0x5584f905

    .line 14
    .line 15
    .line 16
    move-object/from16 v4, p10

    .line 17
    .line 18
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    and-int/lit8 v4, v11, 0x6

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v4, 0x2

    .line 35
    :goto_0
    or-int/2addr v4, v11

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v4, v11

    .line 38
    :goto_1
    and-int/lit8 v5, v11, 0x30

    .line 39
    .line 40
    if-nez v5, :cond_3

    .line 41
    .line 42
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    const/16 v5, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v5, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v4, v5

    .line 54
    :cond_3
    and-int/lit16 v5, v11, 0x180

    .line 55
    .line 56
    move-object/from16 v12, p2

    .line 57
    .line 58
    if-nez v5, :cond_5

    .line 59
    .line 60
    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    const/16 v5, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v5, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v4, v5

    .line 72
    :cond_5
    and-int/lit16 v5, v11, 0xc00

    .line 73
    .line 74
    if-nez v5, :cond_7

    .line 75
    .line 76
    move/from16 v5, p3

    .line 77
    .line 78
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_6

    .line 83
    .line 84
    const/16 v7, 0x800

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    const/16 v7, 0x400

    .line 88
    .line 89
    :goto_4
    or-int/2addr v4, v7

    .line 90
    goto :goto_5

    .line 91
    :cond_7
    move/from16 v5, p3

    .line 92
    .line 93
    :goto_5
    and-int/lit16 v7, v11, 0x6000

    .line 94
    .line 95
    if-nez v7, :cond_9

    .line 96
    .line 97
    move/from16 v7, p4

    .line 98
    .line 99
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_8

    .line 104
    .line 105
    const/16 v8, 0x4000

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_8
    const/16 v8, 0x2000

    .line 109
    .line 110
    :goto_6
    or-int/2addr v4, v8

    .line 111
    goto :goto_7

    .line 112
    :cond_9
    move/from16 v7, p4

    .line 113
    .line 114
    :goto_7
    const/high16 v8, 0x30000

    .line 115
    .line 116
    and-int/2addr v8, v11

    .line 117
    if-nez v8, :cond_b

    .line 118
    .line 119
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-eqz v8, :cond_a

    .line 124
    .line 125
    const/high16 v8, 0x20000

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_a
    const/high16 v8, 0x10000

    .line 129
    .line 130
    :goto_8
    or-int/2addr v4, v8

    .line 131
    :cond_b
    const/high16 v8, 0x180000

    .line 132
    .line 133
    and-int/2addr v8, v11

    .line 134
    if-nez v8, :cond_d

    .line 135
    .line 136
    move/from16 v8, p6

    .line 137
    .line 138
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    if-eqz v13, :cond_c

    .line 143
    .line 144
    const/high16 v13, 0x100000

    .line 145
    .line 146
    goto :goto_9

    .line 147
    :cond_c
    const/high16 v13, 0x80000

    .line 148
    .line 149
    :goto_9
    or-int/2addr v4, v13

    .line 150
    goto :goto_a

    .line 151
    :cond_d
    move/from16 v8, p6

    .line 152
    .line 153
    :goto_a
    const/high16 v13, 0xc00000

    .line 154
    .line 155
    and-int/2addr v13, v11

    .line 156
    if-nez v13, :cond_f

    .line 157
    .line 158
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    if-eqz v13, :cond_e

    .line 163
    .line 164
    const/high16 v13, 0x800000

    .line 165
    .line 166
    goto :goto_b

    .line 167
    :cond_e
    const/high16 v13, 0x400000

    .line 168
    .line 169
    :goto_b
    or-int/2addr v4, v13

    .line 170
    :cond_f
    const/high16 v13, 0x6000000

    .line 171
    .line 172
    and-int/2addr v13, v11

    .line 173
    if-nez v13, :cond_11

    .line 174
    .line 175
    move-object/from16 v13, p8

    .line 176
    .line 177
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v15

    .line 181
    if-eqz v15, :cond_10

    .line 182
    .line 183
    const/high16 v15, 0x4000000

    .line 184
    .line 185
    goto :goto_c

    .line 186
    :cond_10
    const/high16 v15, 0x2000000

    .line 187
    .line 188
    :goto_c
    or-int/2addr v4, v15

    .line 189
    goto :goto_d

    .line 190
    :cond_11
    move-object/from16 v13, p8

    .line 191
    .line 192
    :goto_d
    const/high16 v15, 0x30000000

    .line 193
    .line 194
    and-int/2addr v15, v11

    .line 195
    if-nez v15, :cond_13

    .line 196
    .line 197
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v15

    .line 201
    if-eqz v15, :cond_12

    .line 202
    .line 203
    const/high16 v15, 0x20000000

    .line 204
    .line 205
    goto :goto_e

    .line 206
    :cond_12
    const/high16 v15, 0x10000000

    .line 207
    .line 208
    :goto_e
    or-int/2addr v4, v15

    .line 209
    :cond_13
    move v15, v4

    .line 210
    const v4, 0x12492493

    .line 211
    .line 212
    .line 213
    and-int/2addr v4, v15

    .line 214
    const v14, 0x12492492

    .line 215
    .line 216
    .line 217
    if-ne v4, v14, :cond_15

    .line 218
    .line 219
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_14

    .line 224
    .line 225
    goto :goto_f

    .line 226
    :cond_14
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_13

    .line 230
    .line 231
    :cond_15
    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_16

    .line 236
    .line 237
    const/4 v4, -0x1

    .line 238
    const-string v14, "androidx.compose.material3.Day (DatePicker.kt:1941)"

    .line 239
    .line 240
    invoke-static {v3, v15, v4, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :cond_16
    const/high16 v3, 0x1c00000

    .line 244
    .line 245
    and-int/2addr v3, v15

    .line 246
    const/4 v14, 0x1

    .line 247
    const/high16 v4, 0x800000

    .line 248
    .line 249
    if-ne v3, v4, :cond_17

    .line 250
    .line 251
    move v3, v14

    .line 252
    goto :goto_10

    .line 253
    :cond_17
    const/4 v3, 0x0

    .line 254
    :goto_10
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    if-nez v3, :cond_18

    .line 259
    .line 260
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 261
    .line 262
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    if-ne v4, v3, :cond_19

    .line 267
    .line 268
    :cond_18
    new-instance v4, Landroidx/compose/material3/DatePickerKt$Day$1$1;

    .line 269
    .line 270
    invoke-direct {v4, v9}, Landroidx/compose/material3/DatePickerKt$Day$1$1;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_19
    check-cast v4, Lr6/c;

    .line 277
    .line 278
    invoke-static {v1, v14, v4}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLr6/c;)Landroidx/compose/ui/Modifier;

    .line 279
    .line 280
    .line 281
    move-result-object v16

    .line 282
    sget-object v17, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 283
    .line 284
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getDateContainerShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    const/4 v4, 0x6

    .line 289
    invoke-static {v3, v6, v4}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 290
    .line 291
    .line 292
    move-result-object v18

    .line 293
    shr-int/lit8 v3, v15, 0x3

    .line 294
    .line 295
    and-int/lit8 v4, v3, 0xe

    .line 296
    .line 297
    shr-int/lit8 v19, v15, 0x9

    .line 298
    .line 299
    and-int/lit8 v19, v19, 0x70

    .line 300
    .line 301
    or-int v4, v4, v19

    .line 302
    .line 303
    and-int/lit16 v14, v3, 0x380

    .line 304
    .line 305
    or-int/2addr v4, v14

    .line 306
    shr-int/lit8 v14, v15, 0xf

    .line 307
    .line 308
    and-int/lit16 v0, v14, 0x1c00

    .line 309
    .line 310
    or-int/2addr v0, v4

    .line 311
    move v4, v7

    .line 312
    move v7, v0

    .line 313
    move v0, v3

    .line 314
    move v3, v2

    .line 315
    move-object v2, v13

    .line 316
    invoke-virtual/range {v2 .. v7}, Landroidx/compose/material3/DatePickerColors;->dayContainerColor$material3_release(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    check-cast v2, Landroidx/compose/ui/graphics/Color;

    .line 325
    .line 326
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 327
    .line 328
    .line 329
    move-result-wide v19

    .line 330
    and-int/lit8 v2, v14, 0xe

    .line 331
    .line 332
    and-int/lit8 v3, v15, 0x70

    .line 333
    .line 334
    or-int/2addr v2, v3

    .line 335
    shr-int/lit8 v3, v15, 0xc

    .line 336
    .line 337
    and-int/lit16 v4, v3, 0x380

    .line 338
    .line 339
    or-int/2addr v2, v4

    .line 340
    and-int/lit16 v4, v0, 0x1c00

    .line 341
    .line 342
    or-int/2addr v2, v4

    .line 343
    const v4, 0xe000

    .line 344
    .line 345
    .line 346
    and-int/2addr v3, v4

    .line 347
    or-int/2addr v2, v3

    .line 348
    move/from16 v4, p1

    .line 349
    .line 350
    move/from16 v3, p5

    .line 351
    .line 352
    move-object v7, v6

    .line 353
    move v5, v8

    .line 354
    move/from16 v6, p4

    .line 355
    .line 356
    move v8, v2

    .line 357
    move-object/from16 v2, p8

    .line 358
    .line 359
    invoke-virtual/range {v2 .. v8}, Landroidx/compose/material3/DatePickerColors;->dayContentColor$material3_release(ZZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 360
    .line 361
    .line 362
    move-result-object v8

    .line 363
    move-object v6, v7

    .line 364
    invoke-interface {v8}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    check-cast v2, Landroidx/compose/ui/graphics/Color;

    .line 369
    .line 370
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 371
    .line 372
    .line 373
    move-result-wide v2

    .line 374
    if-eqz p5, :cond_1a

    .line 375
    .line 376
    if-nez p1, :cond_1a

    .line 377
    .line 378
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getDateTodayContainerOutlineWidth-D9Ej5fM()F

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/material3/DatePickerColors;->getTodayDateBorderColor-0d7_KjU()J

    .line 383
    .line 384
    .line 385
    move-result-wide v7

    .line 386
    invoke-static {v4, v7, v8}, Landroidx/compose/foundation/BorderStrokeKt;->BorderStroke-cXLIe8U(FJ)Landroidx/compose/foundation/BorderStroke;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    :goto_11
    move-object v13, v4

    .line 391
    goto :goto_12

    .line 392
    :cond_1a
    const/4 v4, 0x0

    .line 393
    goto :goto_11

    .line 394
    :goto_12
    new-instance v4, Landroidx/compose/material3/DatePickerKt$Day$2;

    .line 395
    .line 396
    invoke-direct {v4, v10}, Landroidx/compose/material3/DatePickerKt$Day$2;-><init>(Lr6/e;)V

    .line 397
    .line 398
    .line 399
    const/16 v5, 0x36

    .line 400
    .line 401
    const v7, -0x791a83db

    .line 402
    .line 403
    .line 404
    const/4 v8, 0x1

    .line 405
    invoke-static {v7, v8, v4, v6, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 406
    .line 407
    .line 408
    move-result-object v15

    .line 409
    and-int/lit16 v0, v0, 0x1c7e

    .line 410
    .line 411
    move-object v7, v6

    .line 412
    move-object/from16 v6, v18

    .line 413
    .line 414
    const/16 v18, 0x30

    .line 415
    .line 416
    move-object/from16 v4, v16

    .line 417
    .line 418
    move-object/from16 v16, v7

    .line 419
    .line 420
    move-wide/from16 v7, v19

    .line 421
    .line 422
    const/16 v19, 0x580

    .line 423
    .line 424
    const/4 v11, 0x0

    .line 425
    const/4 v12, 0x0

    .line 426
    const/4 v14, 0x0

    .line 427
    move/from16 v5, p4

    .line 428
    .line 429
    move/from16 v17, v0

    .line 430
    .line 431
    move-wide v9, v2

    .line 432
    move/from16 v2, p1

    .line 433
    .line 434
    move-object/from16 v3, p2

    .line 435
    .line 436
    invoke-static/range {v2 .. v19}, Landroidx/compose/material3/SurfaceKt;->Surface-d85dljk(ZLr6/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Landroidx/compose/runtime/Composer;III)V

    .line 437
    .line 438
    .line 439
    move-object/from16 v6, v16

    .line 440
    .line 441
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-eqz v0, :cond_1b

    .line 446
    .line 447
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 448
    .line 449
    .line 450
    :cond_1b
    :goto_13
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 451
    .line 452
    .line 453
    move-result-object v12

    .line 454
    if-eqz v12, :cond_1c

    .line 455
    .line 456
    new-instance v0, Landroidx/compose/material3/DatePickerKt$Day$3;

    .line 457
    .line 458
    move/from16 v2, p1

    .line 459
    .line 460
    move-object/from16 v3, p2

    .line 461
    .line 462
    move/from16 v4, p3

    .line 463
    .line 464
    move/from16 v5, p4

    .line 465
    .line 466
    move/from16 v6, p5

    .line 467
    .line 468
    move/from16 v7, p6

    .line 469
    .line 470
    move-object/from16 v8, p7

    .line 471
    .line 472
    move-object/from16 v9, p8

    .line 473
    .line 474
    move-object/from16 v10, p9

    .line 475
    .line 476
    move/from16 v11, p11

    .line 477
    .line 478
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/DatePickerKt$Day$3;-><init>(Landroidx/compose/ui/Modifier;ZLr6/a;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;I)V

    .line 479
    .line 480
    .line 481
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 482
    .line 483
    .line 484
    :cond_1c
    return-void
.end method

.method public static final DisplayModeToggleButton-tER2X8s(Landroidx/compose/ui/Modifier;ILr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "I",
            "Lr6/c;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, 0x53146763

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v7

    .line 8
    and-int/lit8 p3, p4, 0x6

    .line 9
    .line 10
    if-nez p3, :cond_1

    .line 11
    .line 12
    invoke-interface {v7, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    const/4 p3, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p3, 0x2

    .line 21
    :goto_0
    or-int/2addr p3, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p3, p4

    .line 24
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v7, p1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr p3, v1

    .line 40
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 41
    .line 42
    const/16 v2, 0x100

    .line 43
    .line 44
    if-nez v1, :cond_5

    .line 45
    .line 46
    invoke-interface {v7, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    move v1, v2

    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/16 v1, 0x80

    .line 55
    .line 56
    :goto_3
    or-int/2addr p3, v1

    .line 57
    :cond_5
    and-int/lit16 v1, p3, 0x93

    .line 58
    .line 59
    const/16 v3, 0x92

    .line 60
    .line 61
    if-ne v1, v3, :cond_7

    .line 62
    .line 63
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_6

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_6
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 71
    .line 72
    .line 73
    move-object v2, p0

    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_8

    .line 81
    .line 82
    const/4 v1, -0x1

    .line 83
    const-string v3, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1361)"

    .line 84
    .line 85
    invoke-static {v0, p3, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_8
    sget-object v0, Landroidx/compose/material3/DisplayMode;->Companion:Landroidx/compose/material3/DisplayMode$Companion;

    .line 89
    .line 90
    invoke-virtual {v0}, Landroidx/compose/material3/DisplayMode$Companion;->getPicker-jFl-4v0()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-static {p1, v0}, Landroidx/compose/material3/DisplayMode;->equals-impl0(II)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    const/high16 v1, 0x30000

    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    const/4 v4, 0x1

    .line 102
    if-eqz v0, :cond_c

    .line 103
    .line 104
    const v0, -0x1882b5bc

    .line 105
    .line 106
    .line 107
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 108
    .line 109
    .line 110
    and-int/lit16 v0, p3, 0x380

    .line 111
    .line 112
    if-ne v0, v2, :cond_9

    .line 113
    .line 114
    move v3, v4

    .line 115
    :cond_9
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-nez v3, :cond_a

    .line 120
    .line 121
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 122
    .line 123
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    if-ne v0, v2, :cond_b

    .line 128
    .line 129
    :cond_a
    new-instance v0, Landroidx/compose/material3/DatePickerKt$DisplayModeToggleButton$1$1;

    .line 130
    .line 131
    invoke-direct {v0, p2}, Landroidx/compose/material3/DatePickerKt$DisplayModeToggleButton$1$1;-><init>(Lr6/c;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_b
    check-cast v0, Lr6/a;

    .line 138
    .line 139
    sget-object v2, Landroidx/compose/material3/ComposableSingletons$DatePickerKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$DatePickerKt;

    .line 140
    .line 141
    invoke-virtual {v2}, Landroidx/compose/material3/ComposableSingletons$DatePickerKt;->getLambda-1$material3_release()Lr6/e;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    shl-int/lit8 p3, p3, 0x3

    .line 146
    .line 147
    and-int/lit8 p3, p3, 0x70

    .line 148
    .line 149
    or-int v8, p3, v1

    .line 150
    .line 151
    const/16 v9, 0x1c

    .line 152
    .line 153
    const/4 v3, 0x0

    .line 154
    const/4 v4, 0x0

    .line 155
    const/4 v5, 0x0

    .line 156
    move-object v2, p0

    .line 157
    move-object v1, v0

    .line 158
    invoke-static/range {v1 .. v9}, Landroidx/compose/material3/IconButtonKt;->IconButton(Lr6/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_c
    const v0, -0x187e6825

    .line 166
    .line 167
    .line 168
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 169
    .line 170
    .line 171
    and-int/lit16 v0, p3, 0x380

    .line 172
    .line 173
    if-ne v0, v2, :cond_d

    .line 174
    .line 175
    move v3, v4

    .line 176
    :cond_d
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-nez v3, :cond_e

    .line 181
    .line 182
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 183
    .line 184
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    if-ne v0, v2, :cond_f

    .line 189
    .line 190
    :cond_e
    new-instance v0, Landroidx/compose/material3/DatePickerKt$DisplayModeToggleButton$2$1;

    .line 191
    .line 192
    invoke-direct {v0, p2}, Landroidx/compose/material3/DatePickerKt$DisplayModeToggleButton$2$1;-><init>(Lr6/c;)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_f
    check-cast v0, Lr6/a;

    .line 199
    .line 200
    sget-object v2, Landroidx/compose/material3/ComposableSingletons$DatePickerKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$DatePickerKt;

    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/material3/ComposableSingletons$DatePickerKt;->getLambda-2$material3_release()Lr6/e;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    shl-int/lit8 p3, p3, 0x3

    .line 207
    .line 208
    and-int/lit8 p3, p3, 0x70

    .line 209
    .line 210
    or-int v8, p3, v1

    .line 211
    .line 212
    const/16 v9, 0x1c

    .line 213
    .line 214
    const/4 v3, 0x0

    .line 215
    const/4 v4, 0x0

    .line 216
    const/4 v5, 0x0

    .line 217
    move-object v2, p0

    .line 218
    move-object v1, v0

    .line 219
    invoke-static/range {v1 .. v9}, Landroidx/compose/material3/IconButtonKt;->IconButton(Lr6/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 223
    .line 224
    .line 225
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    if-eqz p0, :cond_10

    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 232
    .line 233
    .line 234
    :cond_10
    :goto_6
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    if-eqz p0, :cond_11

    .line 239
    .line 240
    new-instance p3, Landroidx/compose/material3/DatePickerKt$DisplayModeToggleButton$3;

    .line 241
    .line 242
    invoke-direct {p3, v2, p1, p2, p4}, Landroidx/compose/material3/DatePickerKt$DisplayModeToggleButton$3;-><init>(Landroidx/compose/ui/Modifier;ILr6/c;I)V

    .line 243
    .line 244
    .line 245
    invoke-interface {p0, p3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 246
    .line 247
    .line 248
    :cond_11
    return-void
.end method

.method private static final HorizontalMonthsList(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Ljava/lang/Long;",
            "Lr6/c;",
            "Lr6/c;",
            "Landroidx/compose/material3/internal/CalendarModel;",
            "Lx6/f;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p4

    .line 4
    .line 5
    move-object/from16 v6, p5

    .line 6
    .line 7
    move-object/from16 v7, p6

    .line 8
    .line 9
    move/from16 v11, p10

    .line 10
    .line 11
    const v0, -0x76e59735

    .line 12
    .line 13
    .line 14
    move-object/from16 v2, p9

    .line 15
    .line 16
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v12

    .line 20
    and-int/lit8 v2, v11, 0x6

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v2, 0x2

    .line 33
    :goto_0
    or-int/2addr v2, v11

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v2, v11

    .line 36
    :goto_1
    and-int/lit8 v4, v11, 0x30

    .line 37
    .line 38
    if-nez v4, :cond_3

    .line 39
    .line 40
    move-object/from16 v4, p1

    .line 41
    .line 42
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    const/16 v5, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v5, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v2, v5

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    move-object/from16 v4, p1

    .line 56
    .line 57
    :goto_3
    and-int/lit16 v5, v11, 0x180

    .line 58
    .line 59
    if-nez v5, :cond_5

    .line 60
    .line 61
    move-object/from16 v5, p2

    .line 62
    .line 63
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-eqz v8, :cond_4

    .line 68
    .line 69
    const/16 v8, 0x100

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_4
    const/16 v8, 0x80

    .line 73
    .line 74
    :goto_4
    or-int/2addr v2, v8

    .line 75
    goto :goto_5

    .line 76
    :cond_5
    move-object/from16 v5, p2

    .line 77
    .line 78
    :goto_5
    and-int/lit16 v8, v11, 0xc00

    .line 79
    .line 80
    move-object/from16 v15, p3

    .line 81
    .line 82
    if-nez v8, :cond_7

    .line 83
    .line 84
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_6

    .line 89
    .line 90
    const/16 v8, 0x800

    .line 91
    .line 92
    goto :goto_6

    .line 93
    :cond_6
    const/16 v8, 0x400

    .line 94
    .line 95
    :goto_6
    or-int/2addr v2, v8

    .line 96
    :cond_7
    and-int/lit16 v8, v11, 0x6000

    .line 97
    .line 98
    if-nez v8, :cond_9

    .line 99
    .line 100
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_8

    .line 105
    .line 106
    const/16 v8, 0x4000

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_8
    const/16 v8, 0x2000

    .line 110
    .line 111
    :goto_7
    or-int/2addr v2, v8

    .line 112
    :cond_9
    const/high16 v8, 0x30000

    .line 113
    .line 114
    and-int/2addr v8, v11

    .line 115
    if-nez v8, :cond_b

    .line 116
    .line 117
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-eqz v8, :cond_a

    .line 122
    .line 123
    const/high16 v8, 0x20000

    .line 124
    .line 125
    goto :goto_8

    .line 126
    :cond_a
    const/high16 v8, 0x10000

    .line 127
    .line 128
    :goto_8
    or-int/2addr v2, v8

    .line 129
    :cond_b
    const/high16 v8, 0x180000

    .line 130
    .line 131
    and-int/2addr v8, v11

    .line 132
    if-nez v8, :cond_e

    .line 133
    .line 134
    const/high16 v8, 0x200000

    .line 135
    .line 136
    and-int/2addr v8, v11

    .line 137
    if-nez v8, :cond_c

    .line 138
    .line 139
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    goto :goto_9

    .line 144
    :cond_c
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    :goto_9
    if-eqz v8, :cond_d

    .line 149
    .line 150
    const/high16 v8, 0x100000

    .line 151
    .line 152
    goto :goto_a

    .line 153
    :cond_d
    const/high16 v8, 0x80000

    .line 154
    .line 155
    :goto_a
    or-int/2addr v2, v8

    .line 156
    :cond_e
    const/high16 v8, 0xc00000

    .line 157
    .line 158
    and-int/2addr v8, v11

    .line 159
    if-nez v8, :cond_10

    .line 160
    .line 161
    move-object/from16 v8, p7

    .line 162
    .line 163
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    if-eqz v9, :cond_f

    .line 168
    .line 169
    const/high16 v9, 0x800000

    .line 170
    .line 171
    goto :goto_b

    .line 172
    :cond_f
    const/high16 v9, 0x400000

    .line 173
    .line 174
    :goto_b
    or-int/2addr v2, v9

    .line 175
    goto :goto_c

    .line 176
    :cond_10
    move-object/from16 v8, p7

    .line 177
    .line 178
    :goto_c
    const/high16 v9, 0x6000000

    .line 179
    .line 180
    and-int/2addr v9, v11

    .line 181
    if-nez v9, :cond_12

    .line 182
    .line 183
    move-object/from16 v9, p8

    .line 184
    .line 185
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    if-eqz v10, :cond_11

    .line 190
    .line 191
    const/high16 v10, 0x4000000

    .line 192
    .line 193
    goto :goto_d

    .line 194
    :cond_11
    const/high16 v10, 0x2000000

    .line 195
    .line 196
    :goto_d
    or-int/2addr v2, v10

    .line 197
    goto :goto_e

    .line 198
    :cond_12
    move-object/from16 v9, p8

    .line 199
    .line 200
    :goto_e
    const v10, 0x2492493

    .line 201
    .line 202
    .line 203
    and-int/2addr v10, v2

    .line 204
    const v14, 0x2492492

    .line 205
    .line 206
    .line 207
    if-ne v10, v14, :cond_14

    .line 208
    .line 209
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    if-nez v10, :cond_13

    .line 214
    .line 215
    goto :goto_f

    .line 216
    :cond_13
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_14

    .line 220
    .line 221
    :cond_14
    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    if-eqz v10, :cond_15

    .line 226
    .line 227
    const/4 v10, -0x1

    .line 228
    const-string v14, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1656)"

    .line 229
    .line 230
    invoke-static {v0, v2, v10, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :cond_15
    invoke-virtual {v3}, Landroidx/compose/material3/internal/CalendarModel;->getToday()Landroidx/compose/material3/internal/CalendarDate;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    const/4 v13, 0x1

    .line 246
    if-nez v10, :cond_16

    .line 247
    .line 248
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 249
    .line 250
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    if-ne v14, v10, :cond_17

    .line 255
    .line 256
    :cond_16
    iget v10, v6, Lx6/d;->a:I

    .line 257
    .line 258
    invoke-virtual {v3, v10, v13}, Landroidx/compose/material3/internal/CalendarModel;->getMonth(II)Landroidx/compose/material3/internal/CalendarMonth;

    .line 259
    .line 260
    .line 261
    move-result-object v14

    .line 262
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :cond_17
    check-cast v14, Landroidx/compose/material3/internal/CalendarMonth;

    .line 266
    .line 267
    sget-object v10, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 268
    .line 269
    invoke-virtual {v10}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getDateLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    const/4 v13, 0x6

    .line 274
    invoke-static {v10, v12, v13}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    .line 275
    .line 276
    .line 277
    move-result-object v13

    .line 278
    move-object v6, v0

    .line 279
    new-instance v0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1;

    .line 280
    .line 281
    move-object v10, v9

    .line 282
    move-object v9, v8

    .line 283
    move-object v8, v7

    .line 284
    move-object v7, v4

    .line 285
    move-object v4, v14

    .line 286
    move v14, v2

    .line 287
    move-object/from16 v2, p5

    .line 288
    .line 289
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Lx6/f;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/material3/internal/CalendarMonth;Lr6/c;Landroidx/compose/material3/internal/CalendarDate;Ljava/lang/Long;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;)V

    .line 290
    .line 291
    .line 292
    move-object v6, v2

    .line 293
    const/16 v1, 0x36

    .line 294
    .line 295
    const v2, 0x59a68b7a

    .line 296
    .line 297
    .line 298
    const/4 v4, 0x1

    .line 299
    invoke-static {v2, v4, v0, v12, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    const/16 v1, 0x30

    .line 304
    .line 305
    invoke-static {v13, v0, v12, v1}, Landroidx/compose/material3/TextKt;->ProvideTextStyle(Landroidx/compose/ui/text/TextStyle;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 306
    .line 307
    .line 308
    and-int/lit8 v7, v14, 0xe

    .line 309
    .line 310
    const/4 v0, 0x0

    .line 311
    const/4 v1, 0x4

    .line 312
    if-ne v7, v1, :cond_18

    .line 313
    .line 314
    move v1, v4

    .line 315
    goto :goto_10

    .line 316
    :cond_18
    move v1, v0

    .line 317
    :goto_10
    and-int/lit16 v2, v14, 0x1c00

    .line 318
    .line 319
    const/16 v5, 0x800

    .line 320
    .line 321
    if-ne v2, v5, :cond_19

    .line 322
    .line 323
    move v13, v4

    .line 324
    goto :goto_11

    .line 325
    :cond_19
    move v13, v0

    .line 326
    :goto_11
    or-int v0, v1, v13

    .line 327
    .line 328
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    or-int/2addr v0, v1

    .line 333
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    or-int/2addr v0, v1

    .line 338
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    if-nez v0, :cond_1b

    .line 343
    .line 344
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 345
    .line 346
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    if-ne v1, v0, :cond_1a

    .line 351
    .line 352
    goto :goto_12

    .line 353
    :cond_1a
    move-object v0, v1

    .line 354
    move-object/from16 v1, p0

    .line 355
    .line 356
    goto :goto_13

    .line 357
    :cond_1b
    :goto_12
    new-instance v0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;

    .line 358
    .line 359
    const/4 v5, 0x0

    .line 360
    move-object/from16 v1, p0

    .line 361
    .line 362
    move-object v4, v6

    .line 363
    move-object v2, v15

    .line 364
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Lh6/c;)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    :goto_13
    check-cast v0, Lr6/e;

    .line 371
    .line 372
    invoke-static {v1, v0, v12, v7}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 373
    .line 374
    .line 375
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-eqz v0, :cond_1c

    .line 380
    .line 381
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 382
    .line 383
    .line 384
    :cond_1c
    :goto_14
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 385
    .line 386
    .line 387
    move-result-object v12

    .line 388
    if-eqz v12, :cond_1d

    .line 389
    .line 390
    new-instance v0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$3;

    .line 391
    .line 392
    move-object/from16 v2, p1

    .line 393
    .line 394
    move-object/from16 v3, p2

    .line 395
    .line 396
    move-object/from16 v4, p3

    .line 397
    .line 398
    move-object/from16 v5, p4

    .line 399
    .line 400
    move-object/from16 v6, p5

    .line 401
    .line 402
    move-object/from16 v7, p6

    .line 403
    .line 404
    move-object/from16 v8, p7

    .line 405
    .line 406
    move-object/from16 v9, p8

    .line 407
    .line 408
    move v10, v11

    .line 409
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$3;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;I)V

    .line 410
    .line 411
    .line 412
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 413
    .line 414
    .line 415
    :cond_1d
    return-void
.end method

.method public static final Month(Landroidx/compose/material3/internal/CalendarMonth;Lr6/c;JLjava/lang/Long;Ljava/lang/Long;Landroidx/compose/material3/SelectedRangeInfo;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 30
    .param p0    # Landroidx/compose/material3/internal/CalendarMonth;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/material3/SelectedRangeInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/material3/DatePickerFormatter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/material3/SelectableDates;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Landroidx/compose/material3/DatePickerColors;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/internal/CalendarMonth;",
            "Lr6/c;",
            "J",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Landroidx/compose/material3/SelectedRangeInfo;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-wide/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move-object/from16 v6, p5

    .line 8
    .line 9
    move-object/from16 v7, p6

    .line 10
    .line 11
    move-object/from16 v8, p7

    .line 12
    .line 13
    move-object/from16 v9, p8

    .line 14
    .line 15
    move-object/from16 v10, p9

    .line 16
    .line 17
    move/from16 v0, p11

    .line 18
    .line 19
    const v1, -0x72041855

    .line 20
    .line 21
    .line 22
    move-object/from16 v11, p10

    .line 23
    .line 24
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v11

    .line 28
    and-int/lit8 v12, v0, 0x6

    .line 29
    .line 30
    if-nez v12, :cond_1

    .line 31
    .line 32
    move-object/from16 v12, p0

    .line 33
    .line 34
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v14

    .line 38
    if-eqz v14, :cond_0

    .line 39
    .line 40
    const/4 v14, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v14, 0x2

    .line 43
    :goto_0
    or-int/2addr v14, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object/from16 v12, p0

    .line 46
    .line 47
    move v14, v0

    .line 48
    :goto_1
    and-int/lit8 v15, v0, 0x30

    .line 49
    .line 50
    if-nez v15, :cond_3

    .line 51
    .line 52
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    if-eqz v15, :cond_2

    .line 57
    .line 58
    const/16 v15, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v15, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v14, v15

    .line 64
    :cond_3
    and-int/lit16 v15, v0, 0x180

    .line 65
    .line 66
    if-nez v15, :cond_5

    .line 67
    .line 68
    invoke-interface {v11, v3, v4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 69
    .line 70
    .line 71
    move-result v15

    .line 72
    if-eqz v15, :cond_4

    .line 73
    .line 74
    const/16 v15, 0x100

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    const/16 v15, 0x80

    .line 78
    .line 79
    :goto_3
    or-int/2addr v14, v15

    .line 80
    :cond_5
    and-int/lit16 v15, v0, 0xc00

    .line 81
    .line 82
    if-nez v15, :cond_7

    .line 83
    .line 84
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v15

    .line 88
    if-eqz v15, :cond_6

    .line 89
    .line 90
    const/16 v15, 0x800

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    const/16 v15, 0x400

    .line 94
    .line 95
    :goto_4
    or-int/2addr v14, v15

    .line 96
    :cond_7
    and-int/lit16 v15, v0, 0x6000

    .line 97
    .line 98
    if-nez v15, :cond_9

    .line 99
    .line 100
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    if-eqz v15, :cond_8

    .line 105
    .line 106
    const/16 v15, 0x4000

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_8
    const/16 v15, 0x2000

    .line 110
    .line 111
    :goto_5
    or-int/2addr v14, v15

    .line 112
    :cond_9
    const/high16 v15, 0x30000

    .line 113
    .line 114
    and-int/2addr v15, v0

    .line 115
    if-nez v15, :cond_b

    .line 116
    .line 117
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    if-eqz v15, :cond_a

    .line 122
    .line 123
    const/high16 v15, 0x20000

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_a
    const/high16 v15, 0x10000

    .line 127
    .line 128
    :goto_6
    or-int/2addr v14, v15

    .line 129
    :cond_b
    const/high16 v15, 0x180000

    .line 130
    .line 131
    and-int/2addr v15, v0

    .line 132
    if-nez v15, :cond_e

    .line 133
    .line 134
    const/high16 v15, 0x200000

    .line 135
    .line 136
    and-int/2addr v15, v0

    .line 137
    if-nez v15, :cond_c

    .line 138
    .line 139
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v15

    .line 143
    goto :goto_7

    .line 144
    :cond_c
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v15

    .line 148
    :goto_7
    if-eqz v15, :cond_d

    .line 149
    .line 150
    const/high16 v15, 0x100000

    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_d
    const/high16 v15, 0x80000

    .line 154
    .line 155
    :goto_8
    or-int/2addr v14, v15

    .line 156
    :cond_e
    const/high16 v15, 0xc00000

    .line 157
    .line 158
    and-int/2addr v15, v0

    .line 159
    if-nez v15, :cond_10

    .line 160
    .line 161
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v15

    .line 165
    if-eqz v15, :cond_f

    .line 166
    .line 167
    const/high16 v15, 0x800000

    .line 168
    .line 169
    goto :goto_9

    .line 170
    :cond_f
    const/high16 v15, 0x400000

    .line 171
    .line 172
    :goto_9
    or-int/2addr v14, v15

    .line 173
    :cond_10
    const/high16 v15, 0x6000000

    .line 174
    .line 175
    and-int/2addr v15, v0

    .line 176
    if-nez v15, :cond_12

    .line 177
    .line 178
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v15

    .line 182
    if-eqz v15, :cond_11

    .line 183
    .line 184
    const/high16 v15, 0x4000000

    .line 185
    .line 186
    goto :goto_a

    .line 187
    :cond_11
    const/high16 v15, 0x2000000

    .line 188
    .line 189
    :goto_a
    or-int/2addr v14, v15

    .line 190
    :cond_12
    const v15, 0x2492493

    .line 191
    .line 192
    .line 193
    and-int/2addr v15, v14

    .line 194
    const v1, 0x2492492

    .line 195
    .line 196
    .line 197
    if-ne v15, v1, :cond_14

    .line 198
    .line 199
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-nez v1, :cond_13

    .line 204
    .line 205
    goto :goto_b

    .line 206
    :cond_13
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 207
    .line 208
    .line 209
    move-object v12, v11

    .line 210
    goto/16 :goto_2b

    .line 211
    .line 212
    :cond_14
    :goto_b
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_15

    .line 217
    .line 218
    const/4 v1, -0x1

    .line 219
    const-string v15, "androidx.compose.material3.Month (DatePicker.kt:1782)"

    .line 220
    .line 221
    const v13, -0x72041855

    .line 222
    .line 223
    .line 224
    invoke-static {v13, v14, v1, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :cond_15
    const v1, 0x6c90de63

    .line 228
    .line 229
    .line 230
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 231
    .line 232
    .line 233
    const/high16 v22, 0x70000

    .line 234
    .line 235
    if-eqz v7, :cond_1a

    .line 236
    .line 237
    const/high16 v23, 0xe000000

    .line 238
    .line 239
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 240
    .line 241
    and-int v13, v14, v22

    .line 242
    .line 243
    const/high16 v15, 0x20000

    .line 244
    .line 245
    if-ne v13, v15, :cond_16

    .line 246
    .line 247
    const/4 v13, 0x1

    .line 248
    goto :goto_c

    .line 249
    :cond_16
    const/4 v13, 0x0

    .line 250
    :goto_c
    and-int v15, v14, v23

    .line 251
    .line 252
    const/high16 v0, 0x4000000

    .line 253
    .line 254
    if-ne v15, v0, :cond_17

    .line 255
    .line 256
    const/4 v0, 0x1

    .line 257
    goto :goto_d

    .line 258
    :cond_17
    const/4 v0, 0x0

    .line 259
    :goto_d
    or-int/2addr v0, v13

    .line 260
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    if-nez v0, :cond_18

    .line 265
    .line 266
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 267
    .line 268
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    if-ne v13, v0, :cond_19

    .line 273
    .line 274
    :cond_18
    new-instance v13, Landroidx/compose/material3/DatePickerKt$Month$rangeSelectionDrawModifier$1$1;

    .line 275
    .line 276
    invoke-direct {v13, v7, v10}, Landroidx/compose/material3/DatePickerKt$Month$rangeSelectionDrawModifier$1$1;-><init>(Landroidx/compose/material3/SelectedRangeInfo;Landroidx/compose/material3/DatePickerColors;)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_19
    check-cast v13, Lr6/c;

    .line 283
    .line 284
    invoke-static {v1, v13}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithContent(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    goto :goto_e

    .line 289
    :cond_1a
    const/high16 v23, 0xe000000

    .line 290
    .line 291
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 292
    .line 293
    :goto_e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 294
    .line 295
    .line 296
    const/4 v1, 0x0

    .line 297
    invoke-static {v11, v1}, Landroidx/compose/material3/CalendarLocale_androidKt;->defaultLocale(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;

    .line 298
    .line 299
    .line 300
    move-result-object v13

    .line 301
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 302
    .line 303
    sget v15, Landroidx/compose/material3/DatePickerKt;->RecommendedSizeForAccessibility:F

    .line 304
    .line 305
    const/4 v3, 0x6

    .line 306
    int-to-float v4, v3

    .line 307
    mul-float/2addr v15, v4

    .line 308
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/SizeKt;->requiredHeight-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 321
    .line 322
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceEvenly()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 327
    .line 328
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-static {v1, v4, v11, v3}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    const/4 v4, 0x0

    .line 337
    invoke-static {v11, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 338
    .line 339
    .line 340
    move-result v15

    .line 341
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    invoke-static {v11, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 350
    .line 351
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 356
    .line 357
    .line 358
    move-result-object v18

    .line 359
    if-nez v18, :cond_1b

    .line 360
    .line 361
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 362
    .line 363
    .line 364
    :cond_1b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 365
    .line 366
    .line 367
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 368
    .line 369
    .line 370
    move-result v18

    .line 371
    if-eqz v18, :cond_1c

    .line 372
    .line 373
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 374
    .line 375
    .line 376
    goto :goto_f

    .line 377
    :cond_1c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 378
    .line 379
    .line 380
    :goto_f
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    invoke-static {v3, v5, v1, v5, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    if-nez v4, :cond_1d

    .line 393
    .line 394
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    move-object/from16 v18, v3

    .line 399
    .line 400
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    if-nez v3, :cond_1e

    .line 409
    .line 410
    goto :goto_10

    .line 411
    :cond_1d
    move-object/from16 v18, v3

    .line 412
    .line 413
    :goto_10
    invoke-static {v15, v5, v15, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 414
    .line 415
    .line 416
    :cond_1e
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 421
    .line 422
    .line 423
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 424
    .line 425
    const v0, -0x269779dc

    .line 426
    .line 427
    .line 428
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 429
    .line 430
    .line 431
    const/4 v0, 0x0

    .line 432
    const/4 v1, 0x0

    .line 433
    const/4 v3, 0x6

    .line 434
    :goto_11
    if-ge v1, v3, :cond_3e

    .line 435
    .line 436
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 437
    .line 438
    const/4 v4, 0x0

    .line 439
    const/4 v5, 0x0

    .line 440
    const/4 v15, 0x1

    .line 441
    invoke-static {v3, v4, v15, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 446
    .line 447
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceEvenly()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    sget-object v16, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 452
    .line 453
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 454
    .line 455
    .line 456
    move-result-object v15

    .line 457
    const/16 v5, 0x36

    .line 458
    .line 459
    invoke-static {v4, v15, v11, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 460
    .line 461
    .line 462
    move-result-object v4

    .line 463
    const/4 v15, 0x0

    .line 464
    invoke-static {v11, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 469
    .line 470
    .line 471
    move-result-object v15

    .line 472
    invoke-static {v11, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    move/from16 v16, v0

    .line 477
    .line 478
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 479
    .line 480
    move/from16 v24, v1

    .line 481
    .line 482
    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 487
    .line 488
    .line 489
    move-result-object v20

    .line 490
    if-nez v20, :cond_1f

    .line 491
    .line 492
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 493
    .line 494
    .line 495
    :cond_1f
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 496
    .line 497
    .line 498
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 499
    .line 500
    .line 501
    move-result v20

    .line 502
    if-eqz v20, :cond_20

    .line 503
    .line 504
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 505
    .line 506
    .line 507
    goto :goto_12

    .line 508
    :cond_20
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 509
    .line 510
    .line 511
    :goto_12
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    invoke-static {v0, v1, v4, v1, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 516
    .line 517
    .line 518
    move-result-object v4

    .line 519
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 520
    .line 521
    .line 522
    move-result v15

    .line 523
    if-nez v15, :cond_21

    .line 524
    .line 525
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v15

    .line 529
    move-object/from16 v20, v0

    .line 530
    .line 531
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    if-nez v0, :cond_22

    .line 540
    .line 541
    goto :goto_13

    .line 542
    :cond_21
    move-object/from16 v20, v0

    .line 543
    .line 544
    :goto_13
    invoke-static {v5, v1, v5, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 545
    .line 546
    .line 547
    :cond_22
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-static {v1, v3, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 552
    .line 553
    .line 554
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 555
    .line 556
    const v0, -0x544d0c7

    .line 557
    .line 558
    .line 559
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 560
    .line 561
    .line 562
    move/from16 v0, v16

    .line 563
    .line 564
    const/4 v1, 0x0

    .line 565
    :goto_14
    const/4 v3, 0x7

    .line 566
    if-ge v1, v3, :cond_3d

    .line 567
    .line 568
    invoke-virtual {v12}, Landroidx/compose/material3/internal/CalendarMonth;->getDaysFromStartOfWeekToFirstOfMonth()I

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    if-lt v0, v3, :cond_23

    .line 573
    .line 574
    invoke-virtual {v12}, Landroidx/compose/material3/internal/CalendarMonth;->getDaysFromStartOfWeekToFirstOfMonth()I

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    invoke-virtual {v12}, Landroidx/compose/material3/internal/CalendarMonth;->getNumberOfDays()I

    .line 579
    .line 580
    .line 581
    move-result v4

    .line 582
    add-int/2addr v4, v3

    .line 583
    if-lt v0, v4, :cond_24

    .line 584
    .line 585
    :cond_23
    move/from16 v25, v0

    .line 586
    .line 587
    move/from16 v26, v1

    .line 588
    .line 589
    move-object v12, v11

    .line 590
    move-object/from16 v29, v13

    .line 591
    .line 592
    move/from16 p10, v14

    .line 593
    .line 594
    const/16 v3, 0x36

    .line 595
    .line 596
    const/4 v4, 0x1

    .line 597
    const/16 v27, 0x2

    .line 598
    .line 599
    const/16 v28, 0x0

    .line 600
    .line 601
    goto/16 :goto_29

    .line 602
    .line 603
    :cond_24
    const v3, 0x5cb5139f

    .line 604
    .line 605
    .line 606
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12}, Landroidx/compose/material3/internal/CalendarMonth;->getDaysFromStartOfWeekToFirstOfMonth()I

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    sub-int v3, v0, v3

    .line 614
    .line 615
    invoke-virtual {v12}, Landroidx/compose/material3/internal/CalendarMonth;->getStartUtcTimeMillis()J

    .line 616
    .line 617
    .line 618
    move-result-wide v4

    .line 619
    move/from16 v25, v0

    .line 620
    .line 621
    move/from16 v26, v1

    .line 622
    .line 623
    int-to-long v0, v3

    .line 624
    const-wide/32 v15, 0x5265c00

    .line 625
    .line 626
    .line 627
    mul-long/2addr v0, v15

    .line 628
    add-long/2addr v0, v4

    .line 629
    cmp-long v4, v0, p2

    .line 630
    .line 631
    if-nez v4, :cond_25

    .line 632
    .line 633
    const/4 v15, 0x1

    .line 634
    goto :goto_15

    .line 635
    :cond_25
    const/4 v15, 0x0

    .line 636
    :goto_15
    if-nez p4, :cond_26

    .line 637
    .line 638
    goto :goto_16

    .line 639
    :cond_26
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Long;->longValue()J

    .line 640
    .line 641
    .line 642
    move-result-wide v4

    .line 643
    cmp-long v4, v0, v4

    .line 644
    .line 645
    if-nez v4, :cond_27

    .line 646
    .line 647
    move-object v4, v13

    .line 648
    const/4 v13, 0x1

    .line 649
    goto :goto_17

    .line 650
    :cond_27
    :goto_16
    move-object v4, v13

    .line 651
    const/4 v13, 0x0

    .line 652
    :goto_17
    if-nez v6, :cond_28

    .line 653
    .line 654
    goto :goto_19

    .line 655
    :cond_28
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 656
    .line 657
    .line 658
    move-result-wide v20

    .line 659
    cmp-long v5, v0, v20

    .line 660
    .line 661
    if-nez v5, :cond_29

    .line 662
    .line 663
    move v5, v14

    .line 664
    const/4 v14, 0x1

    .line 665
    :goto_18
    move-object/from16 v16, v4

    .line 666
    .line 667
    goto :goto_1a

    .line 668
    :cond_29
    :goto_19
    move v5, v14

    .line 669
    const/4 v14, 0x0

    .line 670
    goto :goto_18

    .line 671
    :goto_1a
    const v4, -0x54447bc

    .line 672
    .line 673
    .line 674
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 675
    .line 676
    .line 677
    if-eqz v7, :cond_30

    .line 678
    .line 679
    and-int v4, v5, v22

    .line 680
    .line 681
    move/from16 v20, v5

    .line 682
    .line 683
    const/high16 v5, 0x20000

    .line 684
    .line 685
    if-ne v4, v5, :cond_2a

    .line 686
    .line 687
    const/4 v4, 0x1

    .line 688
    goto :goto_1b

    .line 689
    :cond_2a
    const/4 v4, 0x0

    .line 690
    :goto_1b
    invoke-interface {v11, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 691
    .line 692
    .line 693
    move-result v21

    .line 694
    or-int v4, v4, v21

    .line 695
    .line 696
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v5

    .line 700
    if-nez v4, :cond_2c

    .line 701
    .line 702
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 703
    .line 704
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v4

    .line 708
    if-ne v5, v4, :cond_2b

    .line 709
    .line 710
    goto :goto_1c

    .line 711
    :cond_2b
    move-object v4, v5

    .line 712
    const/4 v5, 0x2

    .line 713
    const/4 v6, 0x0

    .line 714
    goto :goto_20

    .line 715
    :cond_2c
    :goto_1c
    if-eqz p4, :cond_2d

    .line 716
    .line 717
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Long;->longValue()J

    .line 718
    .line 719
    .line 720
    move-result-wide v4

    .line 721
    goto :goto_1d

    .line 722
    :cond_2d
    const-wide v4, 0x7fffffffffffffffL

    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    :goto_1d
    cmp-long v4, v0, v4

    .line 728
    .line 729
    if-ltz v4, :cond_2f

    .line 730
    .line 731
    if-eqz v6, :cond_2e

    .line 732
    .line 733
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 734
    .line 735
    .line 736
    move-result-wide v4

    .line 737
    goto :goto_1e

    .line 738
    :cond_2e
    const-wide/high16 v4, -0x8000000000000000L

    .line 739
    .line 740
    :goto_1e
    cmp-long v4, v0, v4

    .line 741
    .line 742
    if-gtz v4, :cond_2f

    .line 743
    .line 744
    const/4 v4, 0x1

    .line 745
    goto :goto_1f

    .line 746
    :cond_2f
    const/4 v4, 0x0

    .line 747
    :goto_1f
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    const/4 v5, 0x2

    .line 752
    const/4 v6, 0x0

    .line 753
    invoke-static {v4, v6, v5, v6}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 754
    .line 755
    .line 756
    move-result-object v4

    .line 757
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    :goto_20
    check-cast v4, Landroidx/compose/runtime/MutableState;

    .line 761
    .line 762
    invoke-interface {v4}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v4

    .line 766
    check-cast v4, Ljava/lang/Boolean;

    .line 767
    .line 768
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 769
    .line 770
    .line 771
    move-result v4

    .line 772
    move v12, v15

    .line 773
    move v15, v4

    .line 774
    goto :goto_21

    .line 775
    :cond_30
    move/from16 v20, v5

    .line 776
    .line 777
    const/4 v5, 0x2

    .line 778
    const/4 v6, 0x0

    .line 779
    move v12, v15

    .line 780
    const/4 v15, 0x0

    .line 781
    :goto_21
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 782
    .line 783
    .line 784
    move-object/from16 v4, v16

    .line 785
    .line 786
    move-object/from16 v16, v11

    .line 787
    .line 788
    if-eqz v7, :cond_31

    .line 789
    .line 790
    const/4 v11, 0x1

    .line 791
    :goto_22
    const/16 v21, 0x20

    .line 792
    .line 793
    goto :goto_23

    .line 794
    :cond_31
    const/4 v11, 0x0

    .line 795
    goto :goto_22

    .line 796
    :goto_23
    const/16 v17, 0x0

    .line 797
    .line 798
    move-object v6, v4

    .line 799
    move/from16 v27, v5

    .line 800
    .line 801
    move/from16 v5, v20

    .line 802
    .line 803
    const/4 v4, 0x1

    .line 804
    const/16 v28, 0x0

    .line 805
    .line 806
    invoke-static/range {v11 .. v17}, Landroidx/compose/material3/DatePickerKt;->dayContentDescription(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v11

    .line 810
    move/from16 p10, v15

    .line 811
    .line 812
    move v15, v12

    .line 813
    move-object/from16 v12, v16

    .line 814
    .line 815
    move/from16 v16, p10

    .line 816
    .line 817
    move/from16 p10, v5

    .line 818
    .line 819
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 820
    .line 821
    .line 822
    move-result-object v5

    .line 823
    invoke-interface {v8, v5, v6, v4}, Landroidx/compose/material3/DatePickerFormatter;->formatDate(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v5

    .line 827
    if-nez v5, :cond_32

    .line 828
    .line 829
    const-string v5, ""

    .line 830
    .line 831
    :cond_32
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 832
    .line 833
    if-nez v13, :cond_34

    .line 834
    .line 835
    if-eqz v14, :cond_33

    .line 836
    .line 837
    goto :goto_24

    .line 838
    :cond_33
    move/from16 v14, v28

    .line 839
    .line 840
    goto :goto_25

    .line 841
    :cond_34
    :goto_24
    move v14, v4

    .line 842
    :goto_25
    and-int/lit8 v4, p10, 0x70

    .line 843
    .line 844
    move-object/from16 v29, v6

    .line 845
    .line 846
    const/16 v6, 0x20

    .line 847
    .line 848
    if-ne v4, v6, :cond_35

    .line 849
    .line 850
    const/4 v4, 0x1

    .line 851
    goto :goto_26

    .line 852
    :cond_35
    move/from16 v4, v28

    .line 853
    .line 854
    :goto_26
    invoke-interface {v12, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 855
    .line 856
    .line 857
    move-result v17

    .line 858
    or-int v4, v4, v17

    .line 859
    .line 860
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v6

    .line 864
    if-nez v4, :cond_36

    .line 865
    .line 866
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 867
    .line 868
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v4

    .line 872
    if-ne v6, v4, :cond_37

    .line 873
    .line 874
    :cond_36
    new-instance v6, Landroidx/compose/material3/DatePickerKt$Month$1$1$1$1;

    .line 875
    .line 876
    invoke-direct {v6, v2, v0, v1}, Landroidx/compose/material3/DatePickerKt$Month$1$1$1$1;-><init>(Lr6/c;J)V

    .line 877
    .line 878
    .line 879
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 880
    .line 881
    .line 882
    :cond_37
    check-cast v6, Lr6/a;

    .line 883
    .line 884
    invoke-interface {v12, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 885
    .line 886
    .line 887
    move-result v4

    .line 888
    const/high16 v17, 0x1c00000

    .line 889
    .line 890
    and-int v2, p10, v17

    .line 891
    .line 892
    move/from16 v17, v4

    .line 893
    .line 894
    const/high16 v4, 0x800000

    .line 895
    .line 896
    if-ne v2, v4, :cond_38

    .line 897
    .line 898
    const/4 v2, 0x1

    .line 899
    goto :goto_27

    .line 900
    :cond_38
    move/from16 v2, v28

    .line 901
    .line 902
    :goto_27
    or-int v2, v17, v2

    .line 903
    .line 904
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v4

    .line 908
    if-nez v2, :cond_39

    .line 909
    .line 910
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 911
    .line 912
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    if-ne v4, v2, :cond_3b

    .line 917
    .line 918
    :cond_39
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material3/internal/CalendarMonth;->getYear()I

    .line 919
    .line 920
    .line 921
    move-result v2

    .line 922
    invoke-interface {v9, v2}, Landroidx/compose/material3/SelectableDates;->isSelectableYear(I)Z

    .line 923
    .line 924
    .line 925
    move-result v2

    .line 926
    if-eqz v2, :cond_3a

    .line 927
    .line 928
    invoke-interface {v9, v0, v1}, Landroidx/compose/material3/SelectableDates;->isSelectableDate(J)Z

    .line 929
    .line 930
    .line 931
    move-result v0

    .line 932
    if-eqz v0, :cond_3a

    .line 933
    .line 934
    const/4 v0, 0x1

    .line 935
    goto :goto_28

    .line 936
    :cond_3a
    move/from16 v0, v28

    .line 937
    .line 938
    :goto_28
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 939
    .line 940
    .line 941
    move-result-object v4

    .line 942
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 943
    .line 944
    .line 945
    :cond_3b
    check-cast v4, Ljava/lang/Boolean;

    .line 946
    .line 947
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 948
    .line 949
    .line 950
    move-result v0

    .line 951
    if-eqz v11, :cond_3c

    .line 952
    .line 953
    const-string v1, ", "

    .line 954
    .line 955
    invoke-static {v11, v1, v5}, Landroid/support/v4/media/f;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v5

    .line 959
    :cond_3c
    move-object/from16 v17, v5

    .line 960
    .line 961
    new-instance v1, Landroidx/compose/material3/DatePickerKt$Month$1$1$3;

    .line 962
    .line 963
    invoke-direct {v1, v3}, Landroidx/compose/material3/DatePickerKt$Month$1$1$3;-><init>(I)V

    .line 964
    .line 965
    .line 966
    const v2, -0x7ce9f1df

    .line 967
    .line 968
    .line 969
    const/16 v3, 0x36

    .line 970
    .line 971
    const/4 v4, 0x1

    .line 972
    invoke-static {v2, v4, v1, v12, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 973
    .line 974
    .line 975
    move-result-object v19

    .line 976
    const v1, 0x30000006

    .line 977
    .line 978
    .line 979
    and-int v2, p10, v23

    .line 980
    .line 981
    or-int v21, v2, v1

    .line 982
    .line 983
    move-object/from16 v18, p9

    .line 984
    .line 985
    move-object/from16 v20, v12

    .line 986
    .line 987
    move v11, v14

    .line 988
    move v14, v0

    .line 989
    move-object v12, v6

    .line 990
    invoke-static/range {v10 .. v21}, Landroidx/compose/material3/DatePickerKt;->Day(Landroidx/compose/ui/Modifier;ZLr6/a;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 991
    .line 992
    .line 993
    move-object/from16 v12, v20

    .line 994
    .line 995
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 996
    .line 997
    .line 998
    const/4 v1, 0x6

    .line 999
    goto :goto_2a

    .line 1000
    :goto_29
    const v0, 0x5cad3996

    .line 1001
    .line 1002
    .line 1003
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1004
    .line 1005
    .line 1006
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 1007
    .line 1008
    sget v1, Landroidx/compose/material3/DatePickerKt;->RecommendedSizeForAccessibility:F

    .line 1009
    .line 1010
    invoke-static {v0, v1, v1}, Landroidx/compose/foundation/layout/SizeKt;->requiredSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    const/4 v1, 0x6

    .line 1015
    invoke-static {v0, v12, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1016
    .line 1017
    .line 1018
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1019
    .line 1020
    .line 1021
    :goto_2a
    add-int/lit8 v0, v25, 0x1

    .line 1022
    .line 1023
    add-int/lit8 v2, v26, 0x1

    .line 1024
    .line 1025
    move-object/from16 v6, p5

    .line 1026
    .line 1027
    move-object/from16 v10, p9

    .line 1028
    .line 1029
    move/from16 v14, p10

    .line 1030
    .line 1031
    move v1, v2

    .line 1032
    move-object v11, v12

    .line 1033
    move-object/from16 v13, v29

    .line 1034
    .line 1035
    move-object/from16 v12, p0

    .line 1036
    .line 1037
    move-object/from16 v2, p1

    .line 1038
    .line 1039
    goto/16 :goto_14

    .line 1040
    .line 1041
    :cond_3d
    move/from16 v25, v0

    .line 1042
    .line 1043
    move-object v12, v11

    .line 1044
    move-object/from16 v29, v13

    .line 1045
    .line 1046
    move/from16 p10, v14

    .line 1047
    .line 1048
    const/4 v1, 0x6

    .line 1049
    const/4 v4, 0x1

    .line 1050
    const/16 v27, 0x2

    .line 1051
    .line 1052
    const/16 v28, 0x0

    .line 1053
    .line 1054
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1055
    .line 1056
    .line 1057
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1058
    .line 1059
    .line 1060
    add-int/lit8 v0, v24, 0x1

    .line 1061
    .line 1062
    move-object/from16 v2, p1

    .line 1063
    .line 1064
    move-object/from16 v6, p5

    .line 1065
    .line 1066
    move-object/from16 v10, p9

    .line 1067
    .line 1068
    move v3, v1

    .line 1069
    move-object/from16 v12, p0

    .line 1070
    .line 1071
    move v1, v0

    .line 1072
    move/from16 v0, v25

    .line 1073
    .line 1074
    goto/16 :goto_11

    .line 1075
    .line 1076
    :cond_3e
    move-object v12, v11

    .line 1077
    invoke-static {v12}, Landroidx/collection/a;->x(Landroidx/compose/runtime/Composer;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    if-eqz v0, :cond_3f

    .line 1082
    .line 1083
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1084
    .line 1085
    .line 1086
    :cond_3f
    :goto_2b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v12

    .line 1090
    if-eqz v12, :cond_40

    .line 1091
    .line 1092
    new-instance v0, Landroidx/compose/material3/DatePickerKt$Month$2;

    .line 1093
    .line 1094
    move-object/from16 v1, p0

    .line 1095
    .line 1096
    move-object/from16 v2, p1

    .line 1097
    .line 1098
    move-wide/from16 v3, p2

    .line 1099
    .line 1100
    move-object/from16 v5, p4

    .line 1101
    .line 1102
    move-object/from16 v6, p5

    .line 1103
    .line 1104
    move-object/from16 v10, p9

    .line 1105
    .line 1106
    move/from16 v11, p11

    .line 1107
    .line 1108
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/DatePickerKt$Month$2;-><init>(Landroidx/compose/material3/internal/CalendarMonth;Lr6/c;JLjava/lang/Long;Ljava/lang/Long;Landroidx/compose/material3/SelectedRangeInfo;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;I)V

    .line 1109
    .line 1110
    .line 1111
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1112
    .line 1113
    .line 1114
    :cond_40
    return-void
.end method

.method private static final MonthsNavigation(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "ZZZ",
            "Ljava/lang/String;",
            "Lr6/a;",
            "Lr6/a;",
            "Lr6/a;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v4, p3

    .line 4
    .line 5
    move/from16 v10, p10

    .line 6
    .line 7
    const v0, -0x2e21392a

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p9

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v11

    .line 16
    and-int/lit8 v2, v10, 0x6

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x2

    .line 29
    :goto_0
    or-int/2addr v2, v10

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v2, v10

    .line 32
    :goto_1
    and-int/lit8 v3, v10, 0x30

    .line 33
    .line 34
    move/from16 v9, p1

    .line 35
    .line 36
    if-nez v3, :cond_3

    .line 37
    .line 38
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    const/16 v3, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v2, v3

    .line 50
    :cond_3
    and-int/lit16 v3, v10, 0x180

    .line 51
    .line 52
    move/from16 v7, p2

    .line 53
    .line 54
    if-nez v3, :cond_5

    .line 55
    .line 56
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    const/16 v3, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v3, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v2, v3

    .line 68
    :cond_5
    and-int/lit16 v3, v10, 0xc00

    .line 69
    .line 70
    if-nez v3, :cond_7

    .line 71
    .line 72
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_6

    .line 77
    .line 78
    const/16 v3, 0x800

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    const/16 v3, 0x400

    .line 82
    .line 83
    :goto_4
    or-int/2addr v2, v3

    .line 84
    :cond_7
    and-int/lit16 v3, v10, 0x6000

    .line 85
    .line 86
    move-object/from16 v5, p4

    .line 87
    .line 88
    if-nez v3, :cond_9

    .line 89
    .line 90
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_8

    .line 95
    .line 96
    const/16 v3, 0x4000

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    const/16 v3, 0x2000

    .line 100
    .line 101
    :goto_5
    or-int/2addr v2, v3

    .line 102
    :cond_9
    const/high16 v3, 0x30000

    .line 103
    .line 104
    and-int/2addr v3, v10

    .line 105
    move-object/from16 v6, p5

    .line 106
    .line 107
    if-nez v3, :cond_b

    .line 108
    .line 109
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_a

    .line 114
    .line 115
    const/high16 v3, 0x20000

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_a
    const/high16 v3, 0x10000

    .line 119
    .line 120
    :goto_6
    or-int/2addr v2, v3

    .line 121
    :cond_b
    const/high16 v3, 0x180000

    .line 122
    .line 123
    and-int/2addr v3, v10

    .line 124
    if-nez v3, :cond_d

    .line 125
    .line 126
    move-object/from16 v3, p6

    .line 127
    .line 128
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_c

    .line 133
    .line 134
    const/high16 v8, 0x100000

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_c
    const/high16 v8, 0x80000

    .line 138
    .line 139
    :goto_7
    or-int/2addr v2, v8

    .line 140
    goto :goto_8

    .line 141
    :cond_d
    move-object/from16 v3, p6

    .line 142
    .line 143
    :goto_8
    const/high16 v8, 0xc00000

    .line 144
    .line 145
    and-int/2addr v8, v10

    .line 146
    if-nez v8, :cond_f

    .line 147
    .line 148
    move-object/from16 v8, p7

    .line 149
    .line 150
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-eqz v12, :cond_e

    .line 155
    .line 156
    const/high16 v12, 0x800000

    .line 157
    .line 158
    goto :goto_9

    .line 159
    :cond_e
    const/high16 v12, 0x400000

    .line 160
    .line 161
    :goto_9
    or-int/2addr v2, v12

    .line 162
    goto :goto_a

    .line 163
    :cond_f
    move-object/from16 v8, p7

    .line 164
    .line 165
    :goto_a
    const/high16 v12, 0x6000000

    .line 166
    .line 167
    and-int/2addr v12, v10

    .line 168
    if-nez v12, :cond_11

    .line 169
    .line 170
    move-object/from16 v12, p8

    .line 171
    .line 172
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    if-eqz v13, :cond_10

    .line 177
    .line 178
    const/high16 v13, 0x4000000

    .line 179
    .line 180
    goto :goto_b

    .line 181
    :cond_10
    const/high16 v13, 0x2000000

    .line 182
    .line 183
    :goto_b
    or-int/2addr v2, v13

    .line 184
    goto :goto_c

    .line 185
    :cond_11
    move-object/from16 v12, p8

    .line 186
    .line 187
    :goto_c
    const v13, 0x2492493

    .line 188
    .line 189
    .line 190
    and-int/2addr v13, v2

    .line 191
    const v14, 0x2492492

    .line 192
    .line 193
    .line 194
    if-ne v13, v14, :cond_13

    .line 195
    .line 196
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    if-nez v13, :cond_12

    .line 201
    .line 202
    goto :goto_d

    .line 203
    :cond_12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_10

    .line 207
    .line 208
    :cond_13
    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    if-eqz v13, :cond_14

    .line 213
    .line 214
    const/4 v13, -0x1

    .line 215
    const-string v14, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2150)"

    .line 216
    .line 217
    invoke-static {v0, v2, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_14
    const/4 v0, 0x0

    .line 221
    const/4 v2, 0x0

    .line 222
    const/4 v13, 0x1

    .line 223
    invoke-static {v1, v0, v13, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    sget v2, Landroidx/compose/material3/DatePickerKt;->MonthYearHeight:F

    .line 228
    .line 229
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->requiredHeight-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-eqz v4, :cond_15

    .line 234
    .line 235
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 236
    .line 237
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    goto :goto_e

    .line 242
    :cond_15
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 243
    .line 244
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    :goto_e
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 249
    .line 250
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 251
    .line 252
    .line 253
    move-result-object v14

    .line 254
    const/16 v15, 0x30

    .line 255
    .line 256
    invoke-static {v2, v14, v11, v15}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    const/4 v14, 0x0

    .line 261
    invoke-static {v11, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 262
    .line 263
    .line 264
    move-result v14

    .line 265
    move/from16 p9, v15

    .line 266
    .line 267
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 268
    .line 269
    .line 270
    move-result-object v15

    .line 271
    invoke-static {v11, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 276
    .line 277
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 282
    .line 283
    .line 284
    move-result-object v16

    .line 285
    if-nez v16, :cond_16

    .line 286
    .line 287
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 288
    .line 289
    .line 290
    :cond_16
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 291
    .line 292
    .line 293
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 294
    .line 295
    .line 296
    move-result v16

    .line 297
    if-eqz v16, :cond_17

    .line 298
    .line 299
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 300
    .line 301
    .line 302
    goto :goto_f

    .line 303
    :cond_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 304
    .line 305
    .line 306
    :goto_f
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-static {v13, v1, v2, v1, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 315
    .line 316
    .line 317
    move-result v15

    .line 318
    if-nez v15, :cond_18

    .line 319
    .line 320
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v15

    .line 324
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-nez v3, :cond_19

    .line 333
    .line 334
    :cond_18
    invoke-static {v14, v1, v14, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 335
    .line 336
    .line 337
    :cond_19
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-static {v1, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 342
    .line 343
    .line 344
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 345
    .line 346
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v12}, Landroidx/compose/material3/DatePickerColors;->getNavigationContentColor-0d7_KjU()J

    .line 351
    .line 352
    .line 353
    move-result-wide v1

    .line 354
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    new-instance v2, Landroidx/compose/material3/DatePickerKt$MonthsNavigation$1$1;

    .line 363
    .line 364
    move-object v3, v8

    .line 365
    move-object v8, v6

    .line 366
    move-object/from16 v6, p6

    .line 367
    .line 368
    invoke-direct/range {v2 .. v9}, Landroidx/compose/material3/DatePickerKt$MonthsNavigation$1$1;-><init>(Lr6/a;ZLjava/lang/String;Lr6/a;ZLr6/a;Z)V

    .line 369
    .line 370
    .line 371
    const/16 v1, 0x36

    .line 372
    .line 373
    const v3, -0x39633dce

    .line 374
    .line 375
    .line 376
    const/4 v4, 0x1

    .line 377
    invoke-static {v3, v4, v2, v11, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    sget v2, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    .line 382
    .line 383
    or-int/lit8 v2, v2, 0x30

    .line 384
    .line 385
    invoke-static {v0, v1, v11, v2}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 386
    .line 387
    .line 388
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 389
    .line 390
    .line 391
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_1a

    .line 396
    .line 397
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 398
    .line 399
    .line 400
    :cond_1a
    :goto_10
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    if-eqz v11, :cond_1b

    .line 405
    .line 406
    new-instance v0, Landroidx/compose/material3/DatePickerKt$MonthsNavigation$2;

    .line 407
    .line 408
    move-object/from16 v1, p0

    .line 409
    .line 410
    move/from16 v2, p1

    .line 411
    .line 412
    move/from16 v3, p2

    .line 413
    .line 414
    move/from16 v4, p3

    .line 415
    .line 416
    move-object/from16 v5, p4

    .line 417
    .line 418
    move-object/from16 v6, p5

    .line 419
    .line 420
    move-object/from16 v7, p6

    .line 421
    .line 422
    move-object/from16 v8, p7

    .line 423
    .line 424
    move-object v9, v12

    .line 425
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/DatePickerKt$MonthsNavigation$2;-><init>(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/material3/DatePickerColors;I)V

    .line 426
    .line 427
    .line 428
    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 429
    .line 430
    .line 431
    :cond_1b
    return-void
.end method

.method private static final SwitchableDateEntryContent-d7iavvg(Ljava/lang/Long;JILr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "JI",
            "Lr6/c;",
            "Lr6/c;",
            "Landroidx/compose/material3/internal/CalendarModel;",
            "Lx6/f;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p8

    .line 2
    .line 3
    move/from16 v12, p12

    .line 4
    .line 5
    const v0, -0x355e6715    # -5295221.5f

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p11

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v11

    .line 14
    and-int/lit8 v1, v12, 0x6

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    move-object/from16 v1, p0

    .line 19
    .line 20
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x2

    .line 29
    :goto_0
    or-int/2addr v2, v12

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object/from16 v1, p0

    .line 32
    .line 33
    move v2, v12

    .line 34
    :goto_1
    and-int/lit8 v3, v12, 0x30

    .line 35
    .line 36
    if-nez v3, :cond_3

    .line 37
    .line 38
    move-wide/from16 v3, p1

    .line 39
    .line 40
    invoke-interface {v11, v3, v4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    const/16 v5, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v5, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v2, v5

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    move-wide/from16 v3, p1

    .line 54
    .line 55
    :goto_3
    and-int/lit16 v5, v12, 0x180

    .line 56
    .line 57
    move/from16 v13, p3

    .line 58
    .line 59
    if-nez v5, :cond_5

    .line 60
    .line 61
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_4

    .line 66
    .line 67
    const/16 v5, 0x100

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_4
    const/16 v5, 0x80

    .line 71
    .line 72
    :goto_4
    or-int/2addr v2, v5

    .line 73
    :cond_5
    and-int/lit16 v5, v12, 0xc00

    .line 74
    .line 75
    if-nez v5, :cond_7

    .line 76
    .line 77
    move-object/from16 v5, p4

    .line 78
    .line 79
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_6

    .line 84
    .line 85
    const/16 v6, 0x800

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_6
    const/16 v6, 0x400

    .line 89
    .line 90
    :goto_5
    or-int/2addr v2, v6

    .line 91
    goto :goto_6

    .line 92
    :cond_7
    move-object/from16 v5, p4

    .line 93
    .line 94
    :goto_6
    and-int/lit16 v6, v12, 0x6000

    .line 95
    .line 96
    if-nez v6, :cond_9

    .line 97
    .line 98
    move-object/from16 v6, p5

    .line 99
    .line 100
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_8

    .line 105
    .line 106
    const/16 v7, 0x4000

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_8
    const/16 v7, 0x2000

    .line 110
    .line 111
    :goto_7
    or-int/2addr v2, v7

    .line 112
    goto :goto_8

    .line 113
    :cond_9
    move-object/from16 v6, p5

    .line 114
    .line 115
    :goto_8
    const/high16 v7, 0x30000

    .line 116
    .line 117
    and-int/2addr v7, v12

    .line 118
    if-nez v7, :cond_b

    .line 119
    .line 120
    move-object/from16 v7, p6

    .line 121
    .line 122
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-eqz v9, :cond_a

    .line 127
    .line 128
    const/high16 v9, 0x20000

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_a
    const/high16 v9, 0x10000

    .line 132
    .line 133
    :goto_9
    or-int/2addr v2, v9

    .line 134
    goto :goto_a

    .line 135
    :cond_b
    move-object/from16 v7, p6

    .line 136
    .line 137
    :goto_a
    const/high16 v9, 0x180000

    .line 138
    .line 139
    and-int/2addr v9, v12

    .line 140
    if-nez v9, :cond_d

    .line 141
    .line 142
    move-object/from16 v9, p7

    .line 143
    .line 144
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    if-eqz v10, :cond_c

    .line 149
    .line 150
    const/high16 v10, 0x100000

    .line 151
    .line 152
    goto :goto_b

    .line 153
    :cond_c
    const/high16 v10, 0x80000

    .line 154
    .line 155
    :goto_b
    or-int/2addr v2, v10

    .line 156
    goto :goto_c

    .line 157
    :cond_d
    move-object/from16 v9, p7

    .line 158
    .line 159
    :goto_c
    const/high16 v10, 0xc00000

    .line 160
    .line 161
    and-int/2addr v10, v12

    .line 162
    if-nez v10, :cond_10

    .line 163
    .line 164
    const/high16 v10, 0x1000000

    .line 165
    .line 166
    and-int/2addr v10, v12

    .line 167
    if-nez v10, :cond_e

    .line 168
    .line 169
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    goto :goto_d

    .line 174
    :cond_e
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    :goto_d
    if-eqz v10, :cond_f

    .line 179
    .line 180
    const/high16 v10, 0x800000

    .line 181
    .line 182
    goto :goto_e

    .line 183
    :cond_f
    const/high16 v10, 0x400000

    .line 184
    .line 185
    :goto_e
    or-int/2addr v2, v10

    .line 186
    :cond_10
    const/high16 v10, 0x6000000

    .line 187
    .line 188
    and-int/2addr v10, v12

    .line 189
    if-nez v10, :cond_12

    .line 190
    .line 191
    move-object/from16 v10, p9

    .line 192
    .line 193
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v14

    .line 197
    if-eqz v14, :cond_11

    .line 198
    .line 199
    const/high16 v14, 0x4000000

    .line 200
    .line 201
    goto :goto_f

    .line 202
    :cond_11
    const/high16 v14, 0x2000000

    .line 203
    .line 204
    :goto_f
    or-int/2addr v2, v14

    .line 205
    goto :goto_10

    .line 206
    :cond_12
    move-object/from16 v10, p9

    .line 207
    .line 208
    :goto_10
    const/high16 v14, 0x30000000

    .line 209
    .line 210
    and-int/2addr v14, v12

    .line 211
    if-nez v14, :cond_14

    .line 212
    .line 213
    move-object/from16 v14, p10

    .line 214
    .line 215
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    if-eqz v15, :cond_13

    .line 220
    .line 221
    const/high16 v15, 0x20000000

    .line 222
    .line 223
    goto :goto_11

    .line 224
    :cond_13
    const/high16 v15, 0x10000000

    .line 225
    .line 226
    :goto_11
    or-int/2addr v2, v15

    .line 227
    :goto_12
    move v15, v2

    .line 228
    goto :goto_13

    .line 229
    :cond_14
    move-object/from16 v14, p10

    .line 230
    .line 231
    goto :goto_12

    .line 232
    :goto_13
    const v2, 0x12492493

    .line 233
    .line 234
    .line 235
    and-int/2addr v2, v15

    .line 236
    const v0, 0x12492492

    .line 237
    .line 238
    .line 239
    if-ne v2, v0, :cond_16

    .line 240
    .line 241
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_15

    .line 246
    .line 247
    goto :goto_14

    .line 248
    :cond_15
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 249
    .line 250
    .line 251
    move-object v8, v11

    .line 252
    goto/16 :goto_15

    .line 253
    .line 254
    :cond_16
    :goto_14
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_17

    .line 259
    .line 260
    const/4 v0, -0x1

    .line 261
    const-string v2, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1396)"

    .line 262
    .line 263
    const v1, -0x355e6715    # -5295221.5f

    .line 264
    .line 265
    .line 266
    invoke-static {v1, v15, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 267
    .line 268
    .line 269
    :cond_17
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    check-cast v0, Landroidx/compose/ui/unit/Density;

    .line 278
    .line 279
    const/16 v1, 0x30

    .line 280
    .line 281
    int-to-float v1, v1

    .line 282
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-interface {v0, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    neg-int v0, v0

    .line 291
    invoke-static {v13}, Landroidx/compose/material3/DisplayMode;->box-impl(I)Landroidx/compose/material3/DisplayMode;

    .line 292
    .line 293
    .line 294
    move-result-object v16

    .line 295
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 296
    .line 297
    sget-object v2, Landroidx/compose/material3/DatePickerKt$SwitchableDateEntryContent$1;->INSTANCE:Landroidx/compose/material3/DatePickerKt$SwitchableDateEntryContent$1;

    .line 298
    .line 299
    const/4 v3, 0x0

    .line 300
    const/4 v4, 0x0

    .line 301
    const/4 v12, 0x1

    .line 302
    invoke-static {v1, v4, v2, v12, v3}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLr6/c;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 303
    .line 304
    .line 305
    move-result-object v17

    .line 306
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    if-nez v1, :cond_18

    .line 315
    .line 316
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 317
    .line 318
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    if-ne v2, v1, :cond_19

    .line 323
    .line 324
    :cond_18
    new-instance v2, Landroidx/compose/material3/DatePickerKt$SwitchableDateEntryContent$2$1;

    .line 325
    .line 326
    invoke-direct {v2, v0}, Landroidx/compose/material3/DatePickerKt$SwitchableDateEntryContent$2$1;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    :cond_19
    move-object/from16 v18, v2

    .line 333
    .line 334
    check-cast v18, Lr6/c;

    .line 335
    .line 336
    new-instance v0, Landroidx/compose/material3/DatePickerKt$SwitchableDateEntryContent$3;

    .line 337
    .line 338
    move-object/from16 v1, p0

    .line 339
    .line 340
    move-wide/from16 v2, p1

    .line 341
    .line 342
    move-object v4, v5

    .line 343
    move-object v5, v6

    .line 344
    move-object v6, v7

    .line 345
    move-object v7, v9

    .line 346
    move-object v9, v10

    .line 347
    move-object v10, v14

    .line 348
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/DatePickerKt$SwitchableDateEntryContent$3;-><init>(Ljava/lang/Long;JLr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;)V

    .line 349
    .line 350
    .line 351
    const/16 v1, 0x36

    .line 352
    .line 353
    const v2, -0x1b67ab35

    .line 354
    .line 355
    .line 356
    invoke-static {v2, v12, v0, v11, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    shr-int/lit8 v0, v15, 0x6

    .line 361
    .line 362
    and-int/lit8 v0, v0, 0xe

    .line 363
    .line 364
    const v1, 0x186000

    .line 365
    .line 366
    .line 367
    or-int v9, v0, v1

    .line 368
    .line 369
    const/16 v10, 0x28

    .line 370
    .line 371
    const/4 v4, 0x0

    .line 372
    const-string v5, "DatePickerDisplayModeAnimation"

    .line 373
    .line 374
    const/4 v6, 0x0

    .line 375
    move-object v8, v11

    .line 376
    move-object/from16 v1, v16

    .line 377
    .line 378
    move-object/from16 v2, v17

    .line 379
    .line 380
    move-object/from16 v3, v18

    .line 381
    .line 382
    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/AnimatedContentKt;->AnimatedContent(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lr6/c;Lr6/g;Landroidx/compose/runtime/Composer;II)V

    .line 383
    .line 384
    .line 385
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    if-eqz v0, :cond_1a

    .line 390
    .line 391
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 392
    .line 393
    .line 394
    :cond_1a
    :goto_15
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    if-eqz v14, :cond_1b

    .line 399
    .line 400
    new-instance v0, Landroidx/compose/material3/DatePickerKt$SwitchableDateEntryContent$4;

    .line 401
    .line 402
    move-object/from16 v1, p0

    .line 403
    .line 404
    move-wide/from16 v2, p1

    .line 405
    .line 406
    move-object/from16 v5, p4

    .line 407
    .line 408
    move-object/from16 v6, p5

    .line 409
    .line 410
    move-object/from16 v7, p6

    .line 411
    .line 412
    move-object/from16 v8, p7

    .line 413
    .line 414
    move-object/from16 v9, p8

    .line 415
    .line 416
    move-object/from16 v10, p9

    .line 417
    .line 418
    move-object/from16 v11, p10

    .line 419
    .line 420
    move/from16 v12, p12

    .line 421
    .line 422
    move v4, v13

    .line 423
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/DatePickerKt$SwitchableDateEntryContent$4;-><init>(Ljava/lang/Long;JILr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;I)V

    .line 424
    .line 425
    .line 426
    invoke-interface {v14, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 427
    .line 428
    .line 429
    :cond_1b
    return-void
.end method

.method public static final WeekDays(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/runtime/Composer;I)V
    .locals 33
    .param p0    # Landroidx/compose/material3/DatePickerColors;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/material3/internal/CalendarModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, -0x6e3c9a2f

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    and-int/lit8 v5, v2, 0x6

    .line 17
    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v5, 0x2

    .line 29
    :goto_0
    or-int/2addr v5, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v5, v2

    .line 32
    :goto_1
    and-int/lit8 v6, v2, 0x30

    .line 33
    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    const/16 v6, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v6, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v5, v6

    .line 48
    :cond_3
    and-int/lit8 v6, v5, 0x13

    .line 49
    .line 50
    const/16 v7, 0x12

    .line 51
    .line 52
    if-ne v6, v7, :cond_5

    .line 53
    .line 54
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 62
    .line 63
    .line 64
    move-object/from16 v25, v4

    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_6

    .line 73
    .line 74
    const/4 v6, -0x1

    .line 75
    const-string v7, "androidx.compose.material3.WeekDays (DatePicker.kt:1728)"

    .line 76
    .line 77
    invoke-static {v3, v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_6
    invoke-virtual {v1}, Landroidx/compose/material3/internal/CalendarModel;->getFirstDayOfWeek()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-virtual {v1}, Landroidx/compose/material3/internal/CalendarModel;->getWeekdayNames()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    new-instance v6, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    const/4 v7, 0x1

    .line 94
    sub-int/2addr v3, v7

    .line 95
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    move v9, v3

    .line 100
    :goto_4
    if-ge v9, v8, :cond_7

    .line 101
    .line 102
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    add-int/lit8 v9, v9, 0x1

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_7
    const/4 v8, 0x0

    .line 113
    move v9, v8

    .line 114
    :goto_5
    if-ge v9, v3, :cond_8

    .line 115
    .line 116
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    add-int/lit8 v9, v9, 0x1

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_8
    sget-object v3, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 127
    .line 128
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getWeekdaysLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    const/4 v5, 0x6

    .line 133
    invoke-static {v3, v4, v5}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    .line 134
    .line 135
    .line 136
    move-result-object v24

    .line 137
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 138
    .line 139
    sget v5, Landroidx/compose/material3/DatePickerKt;->RecommendedSizeForAccessibility:F

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    const/4 v10, 0x0

    .line 143
    invoke-static {v3, v9, v5, v7, v10}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v3, v9, v7, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 152
    .line 153
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceEvenly()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 158
    .line 159
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    const/16 v9, 0x36

    .line 164
    .line 165
    invoke-static {v5, v7, v4, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-static {v4, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    invoke-static {v4, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 182
    .line 183
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 188
    .line 189
    .line 190
    move-result-object v13

    .line 191
    if-nez v13, :cond_9

    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 194
    .line 195
    .line 196
    :cond_9
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 197
    .line 198
    .line 199
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 200
    .line 201
    .line 202
    move-result v13

    .line 203
    if-eqz v13, :cond_a

    .line 204
    .line 205
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 206
    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 210
    .line 211
    .line 212
    :goto_6
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    invoke-static {v11, v12, v5, v12, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    if-nez v9, :cond_b

    .line 225
    .line 226
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v13

    .line 234
    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v9

    .line 238
    if-nez v9, :cond_c

    .line 239
    .line 240
    :cond_b
    invoke-static {v7, v12, v7, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 241
    .line 242
    .line 243
    :cond_c
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-static {v12, v3, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 248
    .line 249
    .line 250
    sget-object v3, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 251
    .line 252
    const v3, 0x179d7d93

    .line 253
    .line 254
    .line 255
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    move v5, v8

    .line 263
    :goto_7
    if-ge v5, v3, :cond_13

    .line 264
    .line 265
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    check-cast v7, Lkotlin/Pair;

    .line 270
    .line 271
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 272
    .line 273
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    if-nez v11, :cond_d

    .line 282
    .line 283
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 284
    .line 285
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    if-ne v12, v11, :cond_e

    .line 290
    .line 291
    :cond_d
    new-instance v12, Landroidx/compose/material3/DatePickerKt$WeekDays$1$1$1$1;

    .line 292
    .line 293
    invoke-direct {v12, v7}, Landroidx/compose/material3/DatePickerKt$WeekDays$1$1$1$1;-><init>(Lkotlin/Pair;)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    :cond_e
    check-cast v12, Lr6/c;

    .line 300
    .line 301
    invoke-static {v9, v12}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->clearAndSetSemantics(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 302
    .line 303
    .line 304
    move-result-object v11

    .line 305
    sget v12, Landroidx/compose/material3/DatePickerKt;->RecommendedSizeForAccessibility:F

    .line 306
    .line 307
    invoke-static {v11, v12, v12}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    sget-object v12, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 314
    .line 315
    .line 316
    move-result-object v12

    .line 317
    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    invoke-static {v4, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 326
    .line 327
    .line 328
    move-result-object v14

    .line 329
    invoke-static {v4, v11}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 330
    .line 331
    .line 332
    move-result-object v11

    .line 333
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 334
    .line 335
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 340
    .line 341
    .line 342
    move-result-object v16

    .line 343
    if-nez v16, :cond_f

    .line 344
    .line 345
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 346
    .line 347
    .line 348
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 349
    .line 350
    .line 351
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 352
    .line 353
    .line 354
    move-result v16

    .line 355
    if-eqz v16, :cond_10

    .line 356
    .line 357
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 358
    .line 359
    .line 360
    goto :goto_8

    .line 361
    :cond_10
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 362
    .line 363
    .line 364
    :goto_8
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    invoke-static {v15, v8, v12, v8, v14}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 369
    .line 370
    .line 371
    move-result-object v12

    .line 372
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 373
    .line 374
    .line 375
    move-result v14

    .line 376
    if-nez v14, :cond_11

    .line 377
    .line 378
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v14

    .line 382
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v10

    .line 386
    invoke-static {v14, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v10

    .line 390
    if-nez v10, :cond_12

    .line 391
    .line 392
    :cond_11
    invoke-static {v13, v8, v13, v12}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 393
    .line 394
    .line 395
    :cond_12
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 396
    .line 397
    .line 398
    move-result-object v10

    .line 399
    invoke-static {v8, v11, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 400
    .line 401
    .line 402
    sget-object v8, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 403
    .line 404
    invoke-virtual {v7}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    check-cast v7, Ljava/lang/String;

    .line 409
    .line 410
    const/4 v8, 0x3

    .line 411
    const/4 v10, 0x0

    .line 412
    const/4 v11, 0x0

    .line 413
    invoke-static {v9, v10, v11, v8, v10}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentSize$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 414
    .line 415
    .line 416
    move-result-object v8

    .line 417
    move-object/from16 v25, v4

    .line 418
    .line 419
    move-object v9, v6

    .line 420
    move-object v4, v7

    .line 421
    invoke-virtual {v0}, Landroidx/compose/material3/DatePickerColors;->getWeekdayContentColor-0d7_KjU()J

    .line 422
    .line 423
    .line 424
    move-result-wide v6

    .line 425
    sget-object v12, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 426
    .line 427
    invoke-virtual {v12}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 428
    .line 429
    .line 430
    move-result v12

    .line 431
    invoke-static {v12}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 432
    .line 433
    .line 434
    move-result-object v16

    .line 435
    const/16 v27, 0x0

    .line 436
    .line 437
    const v28, 0xfdf8

    .line 438
    .line 439
    .line 440
    move v13, v5

    .line 441
    move-object v5, v8

    .line 442
    move-object v12, v9

    .line 443
    const-wide/16 v8, 0x0

    .line 444
    .line 445
    move-object v14, v10

    .line 446
    const/4 v10, 0x0

    .line 447
    move v15, v11

    .line 448
    const/4 v11, 0x0

    .line 449
    move-object/from16 v17, v12

    .line 450
    .line 451
    const/4 v12, 0x0

    .line 452
    move/from16 v18, v13

    .line 453
    .line 454
    move-object/from16 v19, v14

    .line 455
    .line 456
    const-wide/16 v13, 0x0

    .line 457
    .line 458
    move/from16 v20, v15

    .line 459
    .line 460
    const/4 v15, 0x0

    .line 461
    move-object/from16 v21, v17

    .line 462
    .line 463
    move/from16 v22, v18

    .line 464
    .line 465
    const-wide/16 v17, 0x0

    .line 466
    .line 467
    move-object/from16 v23, v19

    .line 468
    .line 469
    const/16 v19, 0x0

    .line 470
    .line 471
    move/from16 v26, v20

    .line 472
    .line 473
    const/16 v20, 0x0

    .line 474
    .line 475
    move-object/from16 v29, v21

    .line 476
    .line 477
    const/16 v21, 0x0

    .line 478
    .line 479
    move/from16 v30, v22

    .line 480
    .line 481
    const/16 v22, 0x0

    .line 482
    .line 483
    move-object/from16 v31, v23

    .line 484
    .line 485
    const/16 v23, 0x0

    .line 486
    .line 487
    move/from16 v32, v26

    .line 488
    .line 489
    const/16 v26, 0x30

    .line 490
    .line 491
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 492
    .line 493
    .line 494
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 495
    .line 496
    .line 497
    add-int/lit8 v5, v30, 0x1

    .line 498
    .line 499
    move-object/from16 v4, v25

    .line 500
    .line 501
    move-object/from16 v6, v29

    .line 502
    .line 503
    move-object/from16 v10, v31

    .line 504
    .line 505
    move/from16 v8, v32

    .line 506
    .line 507
    goto/16 :goto_7

    .line 508
    .line 509
    :cond_13
    move-object/from16 v25, v4

    .line 510
    .line 511
    invoke-static/range {v25 .. v25}, Landroidx/collection/a;->x(Landroidx/compose/runtime/Composer;)Z

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    if-eqz v3, :cond_14

    .line 516
    .line 517
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 518
    .line 519
    .line 520
    :cond_14
    :goto_9
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    if-eqz v3, :cond_15

    .line 525
    .line 526
    new-instance v4, Landroidx/compose/material3/DatePickerKt$WeekDays$2;

    .line 527
    .line 528
    invoke-direct {v4, v0, v1, v2}, Landroidx/compose/material3/DatePickerKt$WeekDays$2;-><init>(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/internal/CalendarModel;I)V

    .line 529
    .line 530
    .line 531
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 532
    .line 533
    .line 534
    :cond_15
    return-void
.end method

.method private static final Year(Landroidx/compose/ui/Modifier;ZZLr6/a;ZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Lr6/a;",
            "Z",
            "Ljava/lang/String;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Lr6/e;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v0, p5

    .line 10
    .line 11
    move-object/from16 v7, p6

    .line 12
    .line 13
    move-object/from16 v8, p7

    .line 14
    .line 15
    move/from16 v9, p9

    .line 16
    .line 17
    const v4, 0xe37f0f0

    .line 18
    .line 19
    .line 20
    move-object/from16 v6, p8

    .line 21
    .line 22
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    and-int/lit8 v10, v9, 0x6

    .line 27
    .line 28
    if-nez v10, :cond_1

    .line 29
    .line 30
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    if-eqz v10, :cond_0

    .line 35
    .line 36
    const/4 v10, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v10, 0x2

    .line 39
    :goto_0
    or-int/2addr v10, v9

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v10, v9

    .line 42
    :goto_1
    and-int/lit8 v11, v9, 0x30

    .line 43
    .line 44
    const/16 v12, 0x20

    .line 45
    .line 46
    if-nez v11, :cond_3

    .line 47
    .line 48
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    if-eqz v11, :cond_2

    .line 53
    .line 54
    move v11, v12

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v11, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v10, v11

    .line 59
    :cond_3
    and-int/lit16 v11, v9, 0x180

    .line 60
    .line 61
    const/16 v13, 0x100

    .line 62
    .line 63
    if-nez v11, :cond_5

    .line 64
    .line 65
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    if-eqz v11, :cond_4

    .line 70
    .line 71
    move v11, v13

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const/16 v11, 0x80

    .line 74
    .line 75
    :goto_3
    or-int/2addr v10, v11

    .line 76
    :cond_5
    and-int/lit16 v11, v9, 0xc00

    .line 77
    .line 78
    if-nez v11, :cond_7

    .line 79
    .line 80
    move-object/from16 v11, p3

    .line 81
    .line 82
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    if-eqz v14, :cond_6

    .line 87
    .line 88
    const/16 v14, 0x800

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_6
    const/16 v14, 0x400

    .line 92
    .line 93
    :goto_4
    or-int/2addr v10, v14

    .line 94
    goto :goto_5

    .line 95
    :cond_7
    move-object/from16 v11, p3

    .line 96
    .line 97
    :goto_5
    and-int/lit16 v14, v9, 0x6000

    .line 98
    .line 99
    if-nez v14, :cond_9

    .line 100
    .line 101
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    if-eqz v14, :cond_8

    .line 106
    .line 107
    const/16 v14, 0x4000

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_8
    const/16 v14, 0x2000

    .line 111
    .line 112
    :goto_6
    or-int/2addr v10, v14

    .line 113
    :cond_9
    const/high16 v14, 0x30000

    .line 114
    .line 115
    and-int/2addr v14, v9

    .line 116
    if-nez v14, :cond_b

    .line 117
    .line 118
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    if-eqz v14, :cond_a

    .line 123
    .line 124
    const/high16 v14, 0x20000

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_a
    const/high16 v14, 0x10000

    .line 128
    .line 129
    :goto_7
    or-int/2addr v10, v14

    .line 130
    :cond_b
    const/high16 v14, 0x180000

    .line 131
    .line 132
    and-int/2addr v14, v9

    .line 133
    if-nez v14, :cond_d

    .line 134
    .line 135
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    if-eqz v14, :cond_c

    .line 140
    .line 141
    const/high16 v14, 0x100000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_c
    const/high16 v14, 0x80000

    .line 145
    .line 146
    :goto_8
    or-int/2addr v10, v14

    .line 147
    :cond_d
    const/high16 v14, 0xc00000

    .line 148
    .line 149
    and-int/2addr v14, v9

    .line 150
    if-nez v14, :cond_f

    .line 151
    .line 152
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v14

    .line 156
    if-eqz v14, :cond_e

    .line 157
    .line 158
    const/high16 v14, 0x800000

    .line 159
    .line 160
    goto :goto_9

    .line 161
    :cond_e
    const/high16 v14, 0x400000

    .line 162
    .line 163
    :goto_9
    or-int/2addr v10, v14

    .line 164
    :cond_f
    const v14, 0x492493

    .line 165
    .line 166
    .line 167
    and-int/2addr v14, v10

    .line 168
    const v15, 0x492492

    .line 169
    .line 170
    .line 171
    if-ne v14, v15, :cond_11

    .line 172
    .line 173
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-nez v14, :cond_10

    .line 178
    .line 179
    goto :goto_a

    .line 180
    :cond_10
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_11

    .line 184
    .line 185
    :cond_11
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 186
    .line 187
    .line 188
    move-result v14

    .line 189
    if-eqz v14, :cond_12

    .line 190
    .line 191
    const/4 v14, -0x1

    .line 192
    const-string v15, "androidx.compose.material3.Year (DatePicker.kt:2097)"

    .line 193
    .line 194
    invoke-static {v4, v10, v14, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_12
    and-int/lit16 v4, v10, 0x380

    .line 198
    .line 199
    if-ne v4, v13, :cond_13

    .line 200
    .line 201
    const/4 v4, 0x1

    .line 202
    goto :goto_b

    .line 203
    :cond_13
    const/4 v4, 0x0

    .line 204
    :goto_b
    and-int/lit8 v13, v10, 0x70

    .line 205
    .line 206
    if-ne v13, v12, :cond_14

    .line 207
    .line 208
    const/4 v12, 0x1

    .line 209
    goto :goto_c

    .line 210
    :cond_14
    const/4 v12, 0x0

    .line 211
    :goto_c
    or-int/2addr v4, v12

    .line 212
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    if-nez v4, :cond_16

    .line 217
    .line 218
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 219
    .line 220
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    if-ne v12, v4, :cond_15

    .line 225
    .line 226
    goto :goto_d

    .line 227
    :cond_15
    move-object v4, v12

    .line 228
    goto :goto_f

    .line 229
    :cond_16
    :goto_d
    if-eqz v3, :cond_17

    .line 230
    .line 231
    if-nez v2, :cond_17

    .line 232
    .line 233
    sget-object v4, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 234
    .line 235
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getDateTodayContainerOutlineWidth-D9Ej5fM()F

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    invoke-virtual {v7}, Landroidx/compose/material3/DatePickerColors;->getTodayDateBorderColor-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v14

    .line 243
    invoke-static {v4, v14, v15}, Landroidx/compose/foundation/BorderStrokeKt;->BorderStroke-cXLIe8U(FJ)Landroidx/compose/foundation/BorderStroke;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    goto :goto_e

    .line 248
    :cond_17
    const/4 v4, 0x0

    .line 249
    :goto_e
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    :goto_f
    move-object v14, v4

    .line 253
    check-cast v14, Landroidx/compose/foundation/BorderStroke;

    .line 254
    .line 255
    const/high16 v4, 0x70000

    .line 256
    .line 257
    and-int/2addr v4, v10

    .line 258
    const/high16 v15, 0x20000

    .line 259
    .line 260
    if-ne v4, v15, :cond_18

    .line 261
    .line 262
    const/4 v12, 0x1

    .line 263
    goto :goto_10

    .line 264
    :cond_18
    const/4 v12, 0x0

    .line 265
    :goto_10
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    if-nez v12, :cond_19

    .line 270
    .line 271
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 272
    .line 273
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    if-ne v4, v12, :cond_1a

    .line 278
    .line 279
    :cond_19
    new-instance v4, Landroidx/compose/material3/DatePickerKt$Year$1$1;

    .line 280
    .line 281
    invoke-direct {v4, v0}, Landroidx/compose/material3/DatePickerKt$Year$1$1;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    :cond_1a
    check-cast v4, Lr6/c;

    .line 288
    .line 289
    const/4 v12, 0x1

    .line 290
    invoke-static {v1, v12, v4}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLr6/c;)Landroidx/compose/ui/Modifier;

    .line 291
    .line 292
    .line 293
    move-result-object v15

    .line 294
    sget-object v4, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 295
    .line 296
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getSelectionYearStateLayerShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    const/4 v12, 0x6

    .line 301
    invoke-static {v4, v6, v12}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 302
    .line 303
    .line 304
    move-result-object v17

    .line 305
    shr-int/lit8 v4, v10, 0x3

    .line 306
    .line 307
    and-int/lit8 v18, v4, 0xe

    .line 308
    .line 309
    move/from16 p8, v12

    .line 310
    .line 311
    shr-int/lit8 v12, v10, 0x9

    .line 312
    .line 313
    and-int/lit8 v19, v12, 0x70

    .line 314
    .line 315
    or-int v19, v18, v19

    .line 316
    .line 317
    shr-int/lit8 v0, v10, 0xc

    .line 318
    .line 319
    and-int/lit16 v0, v0, 0x380

    .line 320
    .line 321
    or-int v0, v19, v0

    .line 322
    .line 323
    invoke-virtual {v7, v2, v5, v6, v0}, Landroidx/compose/material3/DatePickerColors;->yearContainerColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    check-cast v0, Landroidx/compose/ui/graphics/Color;

    .line 332
    .line 333
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 334
    .line 335
    .line 336
    move-result-wide v19

    .line 337
    shr-int/lit8 v0, v10, 0x6

    .line 338
    .line 339
    and-int/lit8 v10, v0, 0xe

    .line 340
    .line 341
    or-int/2addr v10, v13

    .line 342
    and-int/lit16 v13, v0, 0x380

    .line 343
    .line 344
    or-int/2addr v10, v13

    .line 345
    and-int/lit16 v12, v12, 0x1c00

    .line 346
    .line 347
    or-int/2addr v10, v12

    .line 348
    move/from16 v21, v4

    .line 349
    .line 350
    move v4, v2

    .line 351
    move-object v2, v7

    .line 352
    move v7, v10

    .line 353
    move/from16 v10, v21

    .line 354
    .line 355
    invoke-virtual/range {v2 .. v7}, Landroidx/compose/material3/DatePickerColors;->yearContentColor$material3_release(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 356
    .line 357
    .line 358
    move-result-object v7

    .line 359
    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    check-cast v2, Landroidx/compose/ui/graphics/Color;

    .line 364
    .line 365
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 366
    .line 367
    .line 368
    move-result-wide v2

    .line 369
    new-instance v4, Landroidx/compose/material3/DatePickerKt$Year$2;

    .line 370
    .line 371
    invoke-direct {v4, v8}, Landroidx/compose/material3/DatePickerKt$Year$2;-><init>(Lr6/e;)V

    .line 372
    .line 373
    .line 374
    const/16 v5, 0x36

    .line 375
    .line 376
    const v7, -0x5dc4f2fa

    .line 377
    .line 378
    .line 379
    const/4 v12, 0x1

    .line 380
    invoke-static {v7, v12, v4, v6, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    and-int/lit8 v0, v0, 0x70

    .line 385
    .line 386
    or-int v0, v18, v0

    .line 387
    .line 388
    and-int/lit16 v5, v10, 0x1c00

    .line 389
    .line 390
    or-int/2addr v0, v5

    .line 391
    const/16 v18, 0x30

    .line 392
    .line 393
    move-wide/from16 v7, v19

    .line 394
    .line 395
    const/16 v19, 0x580

    .line 396
    .line 397
    const/4 v11, 0x0

    .line 398
    const/4 v12, 0x0

    .line 399
    move-object v13, v14

    .line 400
    const/4 v14, 0x0

    .line 401
    move-object v5, v15

    .line 402
    move-object v15, v4

    .line 403
    move-object v4, v5

    .line 404
    move/from16 v5, p4

    .line 405
    .line 406
    move-wide v9, v2

    .line 407
    move-object/from16 v16, v6

    .line 408
    .line 409
    move-object/from16 v6, v17

    .line 410
    .line 411
    move/from16 v2, p1

    .line 412
    .line 413
    move-object/from16 v3, p3

    .line 414
    .line 415
    move/from16 v17, v0

    .line 416
    .line 417
    invoke-static/range {v2 .. v19}, Landroidx/compose/material3/SurfaceKt;->Surface-d85dljk(ZLr6/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Landroidx/compose/runtime/Composer;III)V

    .line 418
    .line 419
    .line 420
    move-object/from16 v6, v16

    .line 421
    .line 422
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    if-eqz v0, :cond_1b

    .line 427
    .line 428
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 429
    .line 430
    .line 431
    :cond_1b
    :goto_11
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 432
    .line 433
    .line 434
    move-result-object v10

    .line 435
    if-eqz v10, :cond_1c

    .line 436
    .line 437
    new-instance v0, Landroidx/compose/material3/DatePickerKt$Year$3;

    .line 438
    .line 439
    move/from16 v2, p1

    .line 440
    .line 441
    move/from16 v3, p2

    .line 442
    .line 443
    move-object/from16 v4, p3

    .line 444
    .line 445
    move/from16 v5, p4

    .line 446
    .line 447
    move-object/from16 v6, p5

    .line 448
    .line 449
    move-object/from16 v7, p6

    .line 450
    .line 451
    move-object/from16 v8, p7

    .line 452
    .line 453
    move/from16 v9, p9

    .line 454
    .line 455
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/DatePickerKt$Year$3;-><init>(Landroidx/compose/ui/Modifier;ZZLr6/a;ZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;I)V

    .line 456
    .line 457
    .line 458
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 459
    .line 460
    .line 461
    :cond_1c
    return-void
.end method

.method private static final YearPicker(Landroidx/compose/ui/Modifier;JLr6/c;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "J",
            "Lr6/c;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/internal/CalendarModel;",
            "Lx6/f;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move/from16 v9, p9

    .line 2
    .line 3
    const v0, -0x4cb48864

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p8

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, v9, 0x6

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    move-object/from16 v2, p0

    .line 17
    .line 18
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v3, 0x2

    .line 27
    :goto_0
    or-int/2addr v3, v9

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object/from16 v2, p0

    .line 30
    .line 31
    move v3, v9

    .line 32
    :goto_1
    and-int/lit8 v4, v9, 0x30

    .line 33
    .line 34
    move-wide/from16 v12, p1

    .line 35
    .line 36
    if-nez v4, :cond_3

    .line 37
    .line 38
    invoke-interface {v1, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    const/16 v4, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v4, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v3, v4

    .line 50
    :cond_3
    and-int/lit16 v4, v9, 0x180

    .line 51
    .line 52
    if-nez v4, :cond_5

    .line 53
    .line 54
    move-object/from16 v4, p3

    .line 55
    .line 56
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    const/16 v5, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v5, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v3, v5

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    move-object/from16 v4, p3

    .line 70
    .line 71
    :goto_4
    and-int/lit16 v5, v9, 0xc00

    .line 72
    .line 73
    if-nez v5, :cond_7

    .line 74
    .line 75
    move-object/from16 v5, p4

    .line 76
    .line 77
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_6

    .line 82
    .line 83
    const/16 v6, 0x800

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_6
    const/16 v6, 0x400

    .line 87
    .line 88
    :goto_5
    or-int/2addr v3, v6

    .line 89
    goto :goto_6

    .line 90
    :cond_7
    move-object/from16 v5, p4

    .line 91
    .line 92
    :goto_6
    and-int/lit16 v6, v9, 0x6000

    .line 93
    .line 94
    if-nez v6, :cond_9

    .line 95
    .line 96
    move-object/from16 v6, p5

    .line 97
    .line 98
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_8

    .line 103
    .line 104
    const/16 v7, 0x4000

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_8
    const/16 v7, 0x2000

    .line 108
    .line 109
    :goto_7
    or-int/2addr v3, v7

    .line 110
    goto :goto_8

    .line 111
    :cond_9
    move-object/from16 v6, p5

    .line 112
    .line 113
    :goto_8
    const/high16 v7, 0x30000

    .line 114
    .line 115
    and-int/2addr v7, v9

    .line 116
    if-nez v7, :cond_b

    .line 117
    .line 118
    move-object/from16 v7, p6

    .line 119
    .line 120
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eqz v8, :cond_a

    .line 125
    .line 126
    const/high16 v8, 0x20000

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_a
    const/high16 v8, 0x10000

    .line 130
    .line 131
    :goto_9
    or-int/2addr v3, v8

    .line 132
    goto :goto_a

    .line 133
    :cond_b
    move-object/from16 v7, p6

    .line 134
    .line 135
    :goto_a
    const/high16 v8, 0x180000

    .line 136
    .line 137
    and-int/2addr v8, v9

    .line 138
    if-nez v8, :cond_d

    .line 139
    .line 140
    move-object/from16 v8, p7

    .line 141
    .line 142
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    if-eqz v10, :cond_c

    .line 147
    .line 148
    const/high16 v10, 0x100000

    .line 149
    .line 150
    goto :goto_b

    .line 151
    :cond_c
    const/high16 v10, 0x80000

    .line 152
    .line 153
    :goto_b
    or-int/2addr v3, v10

    .line 154
    goto :goto_c

    .line 155
    :cond_d
    move-object/from16 v8, p7

    .line 156
    .line 157
    :goto_c
    const v10, 0x92493

    .line 158
    .line 159
    .line 160
    and-int/2addr v10, v3

    .line 161
    const v11, 0x92492

    .line 162
    .line 163
    .line 164
    if-ne v10, v11, :cond_f

    .line 165
    .line 166
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    if-nez v10, :cond_e

    .line 171
    .line 172
    goto :goto_d

    .line 173
    :cond_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 174
    .line 175
    .line 176
    goto :goto_e

    .line 177
    :cond_f
    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-eqz v10, :cond_10

    .line 182
    .line 183
    const/4 v10, -0x1

    .line 184
    const-string v11, "androidx.compose.material3.YearPicker (DatePicker.kt:2003)"

    .line 185
    .line 186
    invoke-static {v0, v3, v10, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :cond_10
    sget-object v0, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 190
    .line 191
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getSelectionYearLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    const/4 v3, 0x6

    .line 196
    invoke-static {v0, v1, v3}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    new-instance v10, Landroidx/compose/material3/DatePickerKt$YearPicker$1;

    .line 201
    .line 202
    move-object/from16 v16, v2

    .line 203
    .line 204
    move-object/from16 v17, v4

    .line 205
    .line 206
    move-object/from16 v18, v5

    .line 207
    .line 208
    move-object v11, v6

    .line 209
    move-object v14, v7

    .line 210
    move-object v15, v8

    .line 211
    invoke-direct/range {v10 .. v18}, Landroidx/compose/material3/DatePickerKt$YearPicker$1;-><init>(Landroidx/compose/material3/internal/CalendarModel;JLx6/f;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/material3/SelectableDates;)V

    .line 212
    .line 213
    .line 214
    const/16 v2, 0x36

    .line 215
    .line 216
    const v3, 0x4d99a88d    # 3.2224502E8f

    .line 217
    .line 218
    .line 219
    const/4 v4, 0x1

    .line 220
    invoke-static {v3, v4, v10, v1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    const/16 v3, 0x30

    .line 225
    .line 226
    invoke-static {v0, v2, v1, v3}, Landroidx/compose/material3/TextKt;->ProvideTextStyle(Landroidx/compose/ui/text/TextStyle;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 227
    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_11

    .line 234
    .line 235
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 236
    .line 237
    .line 238
    :cond_11
    :goto_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    if-eqz v10, :cond_12

    .line 243
    .line 244
    new-instance v0, Landroidx/compose/material3/DatePickerKt$YearPicker$2;

    .line 245
    .line 246
    move-object/from16 v1, p0

    .line 247
    .line 248
    move-wide/from16 v2, p1

    .line 249
    .line 250
    move-object/from16 v4, p3

    .line 251
    .line 252
    move-object/from16 v5, p4

    .line 253
    .line 254
    move-object/from16 v6, p5

    .line 255
    .line 256
    move-object/from16 v7, p6

    .line 257
    .line 258
    move-object/from16 v8, p7

    .line 259
    .line 260
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/DatePickerKt$YearPicker$2;-><init>(Landroidx/compose/ui/Modifier;JLr6/c;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerColors;I)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 264
    .line 265
    .line 266
    :cond_12
    return-void
.end method

.method private static final YearPickerMenuButton(Lr6/a;ZLandroidx/compose/ui/Modifier;Lr6/e;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            "Z",
            "Landroidx/compose/ui/Modifier;",
            "Lr6/e;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move/from16 v5, p5

    .line 6
    .line 7
    const v0, 0x186ad492

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p4

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v15

    .line 16
    and-int/lit8 v1, p6, 0x1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    or-int/lit8 v1, v5, 0x6

    .line 21
    .line 22
    move v3, v1

    .line 23
    move-object/from16 v1, p0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v1, v5, 0x6

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    move-object/from16 v1, p0

    .line 31
    .line 32
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v3, 0x2

    .line 41
    :goto_0
    or-int/2addr v3, v5

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object/from16 v1, p0

    .line 44
    .line 45
    move v3, v5

    .line 46
    :goto_1
    and-int/lit8 v6, p6, 0x2

    .line 47
    .line 48
    if-eqz v6, :cond_3

    .line 49
    .line 50
    or-int/lit8 v3, v3, 0x30

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    and-int/lit8 v6, v5, 0x30

    .line 54
    .line 55
    if-nez v6, :cond_5

    .line 56
    .line 57
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    const/16 v6, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/16 v6, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v3, v6

    .line 69
    :cond_5
    :goto_3
    and-int/lit8 v6, p6, 0x4

    .line 70
    .line 71
    if-eqz v6, :cond_7

    .line 72
    .line 73
    or-int/lit16 v3, v3, 0x180

    .line 74
    .line 75
    :cond_6
    move-object/from16 v7, p2

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_7
    and-int/lit16 v7, v5, 0x180

    .line 79
    .line 80
    if-nez v7, :cond_6

    .line 81
    .line 82
    move-object/from16 v7, p2

    .line 83
    .line 84
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_8

    .line 89
    .line 90
    const/16 v8, 0x100

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_8
    const/16 v8, 0x80

    .line 94
    .line 95
    :goto_4
    or-int/2addr v3, v8

    .line 96
    :goto_5
    and-int/lit8 v8, p6, 0x8

    .line 97
    .line 98
    if-eqz v8, :cond_9

    .line 99
    .line 100
    or-int/lit16 v3, v3, 0xc00

    .line 101
    .line 102
    goto :goto_7

    .line 103
    :cond_9
    and-int/lit16 v8, v5, 0xc00

    .line 104
    .line 105
    if-nez v8, :cond_b

    .line 106
    .line 107
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_a

    .line 112
    .line 113
    const/16 v8, 0x800

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_a
    const/16 v8, 0x400

    .line 117
    .line 118
    :goto_6
    or-int/2addr v3, v8

    .line 119
    :cond_b
    :goto_7
    and-int/lit16 v8, v3, 0x493

    .line 120
    .line 121
    const/16 v9, 0x492

    .line 122
    .line 123
    if-ne v8, v9, :cond_e

    .line 124
    .line 125
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-nez v8, :cond_c

    .line 130
    .line 131
    goto :goto_9

    .line 132
    :cond_c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 133
    .line 134
    .line 135
    :cond_d
    :goto_8
    move-object v3, v7

    .line 136
    goto/16 :goto_b

    .line 137
    .line 138
    :cond_e
    :goto_9
    if-eqz v6, :cond_f

    .line 139
    .line 140
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 141
    .line 142
    move-object/from16 v18, v6

    .line 143
    .line 144
    goto :goto_a

    .line 145
    :cond_f
    move-object/from16 v18, v7

    .line 146
    .line 147
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_10

    .line 152
    .line 153
    const/4 v6, -0x1

    .line 154
    const-string v7, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2207)"

    .line 155
    .line 156
    invoke-static {v0, v3, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_10
    invoke-static {}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->getCircleShape()Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget-object v6, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    .line 164
    .line 165
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    check-cast v7, Landroidx/compose/ui/graphics/Color;

    .line 174
    .line 175
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 176
    .line 177
    .line 178
    move-result-wide v9

    .line 179
    const/16 v16, 0x6000

    .line 180
    .line 181
    const/16 v17, 0xd

    .line 182
    .line 183
    const-wide/16 v7, 0x0

    .line 184
    .line 185
    const-wide/16 v11, 0x0

    .line 186
    .line 187
    const-wide/16 v13, 0x0

    .line 188
    .line 189
    invoke-virtual/range {v6 .. v17}, Landroidx/compose/material3/ButtonDefaults;->textButtonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    new-instance v6, Landroidx/compose/material3/DatePickerKt$YearPickerMenuButton$1;

    .line 194
    .line 195
    invoke-direct {v6, v4, v2}, Landroidx/compose/material3/DatePickerKt$YearPickerMenuButton$1;-><init>(Lr6/e;Z)V

    .line 196
    .line 197
    .line 198
    const/16 v7, 0x36

    .line 199
    .line 200
    const v8, 0x71309fb5

    .line 201
    .line 202
    .line 203
    const/4 v9, 0x1

    .line 204
    invoke-static {v8, v9, v6, v15, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    and-int/lit8 v7, v3, 0xe

    .line 209
    .line 210
    const/high16 v8, 0x301b0000

    .line 211
    .line 212
    or-int/2addr v7, v8

    .line 213
    shr-int/lit8 v3, v3, 0x3

    .line 214
    .line 215
    and-int/lit8 v3, v3, 0x70

    .line 216
    .line 217
    or-int v17, v7, v3

    .line 218
    .line 219
    move-object/from16 v7, v18

    .line 220
    .line 221
    const/16 v18, 0x184

    .line 222
    .line 223
    const/4 v8, 0x0

    .line 224
    const/4 v11, 0x0

    .line 225
    const/4 v12, 0x0

    .line 226
    const/4 v13, 0x0

    .line 227
    const/4 v14, 0x0

    .line 228
    move-object v9, v0

    .line 229
    move-object/from16 v16, v15

    .line 230
    .line 231
    move-object v15, v6

    .line 232
    move-object v6, v1

    .line 233
    invoke-static/range {v6 .. v18}, Landroidx/compose/material3/ButtonKt;->TextButton(Lr6/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 234
    .line 235
    .line 236
    move-object/from16 v15, v16

    .line 237
    .line 238
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_d

    .line 243
    .line 244
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 245
    .line 246
    .line 247
    goto :goto_8

    .line 248
    :goto_b
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    if-eqz v7, :cond_11

    .line 253
    .line 254
    new-instance v0, Landroidx/compose/material3/DatePickerKt$YearPickerMenuButton$2;

    .line 255
    .line 256
    move-object/from16 v1, p0

    .line 257
    .line 258
    move/from16 v6, p6

    .line 259
    .line 260
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/DatePickerKt$YearPickerMenuButton$2;-><init>(Lr6/a;ZLandroidx/compose/ui/Modifier;Lr6/e;II)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 264
    .line 265
    .line 266
    :cond_11
    return-void
.end method

.method public static final synthetic access$DatePickerContent(Ljava/lang/Long;JLr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p11}, Landroidx/compose/material3/DatePickerKt;->DatePickerContent(Ljava/lang/Long;JLr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$DatePickerContent$lambda$10(Landroidx/compose/runtime/MutableState;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/DatePickerKt;->DatePickerContent$lambda$10(Landroidx/compose/runtime/MutableState;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$DatePickerContent$lambda$11(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/DatePickerKt;->DatePickerContent$lambda$11(Landroidx/compose/runtime/MutableState;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Day(Landroidx/compose/ui/Modifier;ZLr6/a;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p11}, Landroidx/compose/material3/DatePickerKt;->Day(Landroidx/compose/ui/Modifier;ZLr6/a;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$HorizontalMonthsList(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Landroidx/compose/material3/DatePickerKt;->HorizontalMonthsList(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$MonthsNavigation(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Landroidx/compose/material3/DatePickerKt;->MonthsNavigation(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$SwitchableDateEntryContent-d7iavvg(Ljava/lang/Long;JILr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p12}, Landroidx/compose/material3/DatePickerKt;->SwitchableDateEntryContent-d7iavvg(Ljava/lang/Long;JILr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Year(Landroidx/compose/ui/Modifier;ZZLr6/a;ZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Landroidx/compose/material3/DatePickerKt;->Year(Landroidx/compose/ui/Modifier;ZZLr6/a;ZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$YearPicker(Landroidx/compose/ui/Modifier;JLr6/c;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Landroidx/compose/material3/DatePickerKt;->YearPicker(Landroidx/compose/ui/Modifier;JLr6/c;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$YearPickerMenuButton(Lr6/a;ZLandroidx/compose/ui/Modifier;Lr6/e;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/material3/DatePickerKt;->YearPickerMenuButton(Lr6/a;ZLandroidx/compose/ui/Modifier;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$customScrollActions(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/v;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/DatePickerKt;->customScrollActions(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/v;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getDatePickerHeadlinePadding$p()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/DatePickerKt;->DatePickerHeadlinePadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getDatePickerTitlePadding$p()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/DatePickerKt;->DatePickerTitlePadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getYearsVerticalPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/DatePickerKt;->YearsVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method private static final customScrollActions(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/v;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Lkotlinx/coroutines/v;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/ui/semantics/CustomAccessibilityAction;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material3/DatePickerKt$customScrollActions$scrollUpAction$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroidx/compose/material3/DatePickerKt$customScrollActions$scrollUpAction$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/v;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/compose/material3/DatePickerKt$customScrollActions$scrollDownAction$1;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Landroidx/compose/material3/DatePickerKt$customScrollActions$scrollDownAction$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/v;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Landroidx/compose/ui/semantics/CustomAccessibilityAction;

    .line 12
    .line 13
    invoke-direct {p0, p2, v0}, Landroidx/compose/ui/semantics/CustomAccessibilityAction;-><init>(Ljava/lang/String;Lr6/a;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Landroidx/compose/ui/semantics/CustomAccessibilityAction;

    .line 17
    .line 18
    invoke-direct {p1, p3, v1}, Landroidx/compose/ui/semantics/CustomAccessibilityAction;-><init>(Ljava/lang/String;Lr6/a;)V

    .line 19
    .line 20
    .line 21
    filled-new-array {p0, p1}, [Landroidx/compose/ui/semantics/CustomAccessibilityAction;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method private static final dayContentDescription(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1909)"

    .line 9
    .line 10
    const v2, 0x1dec6877

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p6, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance p6, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const v0, -0x269b9635

    .line 22
    .line 23
    .line 24
    invoke-interface {p5, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz p0, :cond_4

    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    const p0, -0x269b8a64

    .line 33
    .line 34
    .line 35
    invoke-interface {p5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .line 39
    .line 40
    sget p0, Landroidx/compose/material3/R$string;->m3c_date_range_picker_start_headline:I

    .line 41
    .line 42
    invoke-static {p0}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0, p5, v0}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    if-eqz p3, :cond_2

    .line 58
    .line 59
    const p0, -0x269b7ac6

    .line 60
    .line 61
    .line 62
    invoke-interface {p5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .line 66
    .line 67
    sget p0, Landroidx/compose/material3/R$string;->m3c_date_range_picker_end_headline:I

    .line 68
    .line 69
    invoke-static {p0}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-static {p0, p5, v0}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    if-eqz p4, :cond_3

    .line 85
    .line 86
    const p0, -0x269b6b67

    .line 87
    .line 88
    .line 89
    invoke-interface {p5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .line 93
    .line 94
    sget p0, Landroidx/compose/material3/R$string;->m3c_date_range_picker_day_in_range:I

    .line 95
    .line 96
    invoke-static {p0}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    invoke-static {p0, p5, v0}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    const p0, 0x532f0a46

    .line 112
    .line 113
    .line 114
    invoke-interface {p5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 118
    .line 119
    .line 120
    :cond_4
    :goto_0
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 121
    .line 122
    .line 123
    const p0, -0x269b60a9

    .line 124
    .line 125
    .line 126
    invoke-interface {p5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 127
    .line 128
    .line 129
    if-eqz p1, :cond_6

    .line 130
    .line 131
    invoke-interface {p6}, Ljava/lang/CharSequence;->length()I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-lez p0, :cond_5

    .line 136
    .line 137
    const-string p0, ", "

    .line 138
    .line 139
    invoke-virtual {p6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    :cond_5
    sget-object p0, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .line 143
    .line 144
    sget p0, Landroidx/compose/material3/R$string;->m3c_date_picker_today_description:I

    .line 145
    .line 146
    invoke-static {p0}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    invoke-static {p0, p5, v0}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    :cond_6
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 158
    .line 159
    .line 160
    invoke-interface {p6}, Ljava/lang/CharSequence;->length()I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-nez p0, :cond_7

    .line 165
    .line 166
    const/4 p0, 0x0

    .line 167
    goto :goto_1

    .line 168
    :cond_7
    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_8

    .line 177
    .line 178
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 179
    .line 180
    .line 181
    :cond_8
    return-object p0
.end method

.method public static final getDatePickerHorizontalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/DatePickerKt;->DatePickerHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getDatePickerModeTogglePadding()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material3/DatePickerKt;->DatePickerModeTogglePadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getMonthYearHeight()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/DatePickerKt;->MonthYearHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getRecommendedSizeForAccessibility()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/DatePickerKt;->RecommendedSizeForAccessibility:F

    .line 2
    .line 3
    return v0
.end method

.method public static final numberOfMonthsInRange(Lx6/f;)I
    .locals 1
    .param p0    # Lx6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lx6/d;->b:I

    .line 2
    .line 3
    iget p0, p0, Lx6/d;->a:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    mul-int/lit8 v0, v0, 0xc

    .line 9
    .line 10
    return v0
.end method

.method public static final rememberDatePickerState-EU0dCGE(Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;
    .locals 7
    .param p0    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lx6/f;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/material3/SelectableDates;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    and-int/lit8 v0, p7, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    move-object v1, p0

    .line 7
    and-int/lit8 p0, p7, 0x2

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    move-object v2, p1

    .line 14
    :goto_0
    and-int/lit8 p0, p7, 0x4

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    sget-object p0, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/material3/DatePickerDefaults;->getYearRange()Lx6/f;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :cond_2
    move-object v3, p2

    .line 25
    and-int/lit8 p0, p7, 0x8

    .line 26
    .line 27
    if-eqz p0, :cond_3

    .line 28
    .line 29
    sget-object p0, Landroidx/compose/material3/DisplayMode;->Companion:Landroidx/compose/material3/DisplayMode$Companion;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/compose/material3/DisplayMode$Companion;->getPicker-jFl-4v0()I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    :cond_3
    move v4, p3

    .line 36
    and-int/lit8 p0, p7, 0x10

    .line 37
    .line 38
    if-eqz p0, :cond_4

    .line 39
    .line 40
    sget-object p0, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/compose/material3/DatePickerDefaults;->getAllDates()Landroidx/compose/material3/SelectableDates;

    .line 43
    .line 44
    .line 45
    move-result-object p4

    .line 46
    :cond_4
    move-object v5, p4

    .line 47
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_5

    .line 52
    .line 53
    const/4 p0, -0x1

    .line 54
    const-string p1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:364)"

    .line 55
    .line 56
    const p2, 0x7b210ac2

    .line 57
    .line 58
    .line 59
    invoke-static {p2, p6, p0, p1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_5
    const/4 p0, 0x0

    .line 63
    invoke-static {p5, p0}, Landroidx/compose/material3/CalendarLocale_androidKt;->defaultLocale(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    new-array p1, p0, [Ljava/lang/Object;

    .line 68
    .line 69
    sget-object p2, Landroidx/compose/material3/DatePickerStateImpl;->Companion:Landroidx/compose/material3/DatePickerStateImpl$Companion;

    .line 70
    .line 71
    invoke-virtual {p2, v5, v6}, Landroidx/compose/material3/DatePickerStateImpl$Companion;->Saver(Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)Landroidx/compose/runtime/saveable/Saver;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    and-int/lit8 p3, p6, 0xe

    .line 76
    .line 77
    xor-int/lit8 p3, p3, 0x6

    .line 78
    .line 79
    const/4 p4, 0x4

    .line 80
    const/4 p7, 0x1

    .line 81
    if-le p3, p4, :cond_6

    .line 82
    .line 83
    invoke-interface {p5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    if-nez p3, :cond_7

    .line 88
    .line 89
    :cond_6
    and-int/lit8 p3, p6, 0x6

    .line 90
    .line 91
    if-ne p3, p4, :cond_8

    .line 92
    .line 93
    :cond_7
    move p3, p7

    .line 94
    goto :goto_1

    .line 95
    :cond_8
    move p3, p0

    .line 96
    :goto_1
    and-int/lit8 p4, p6, 0x70

    .line 97
    .line 98
    xor-int/lit8 p4, p4, 0x30

    .line 99
    .line 100
    const/16 v0, 0x20

    .line 101
    .line 102
    if-le p4, v0, :cond_9

    .line 103
    .line 104
    invoke-interface {p5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p4

    .line 108
    if-nez p4, :cond_a

    .line 109
    .line 110
    :cond_9
    and-int/lit8 p4, p6, 0x30

    .line 111
    .line 112
    if-ne p4, v0, :cond_b

    .line 113
    .line 114
    :cond_a
    move p4, p7

    .line 115
    goto :goto_2

    .line 116
    :cond_b
    move p4, p0

    .line 117
    :goto_2
    or-int/2addr p3, p4

    .line 118
    invoke-interface {p5, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p4

    .line 122
    or-int/2addr p3, p4

    .line 123
    and-int/lit16 p4, p6, 0x1c00

    .line 124
    .line 125
    xor-int/lit16 p4, p4, 0xc00

    .line 126
    .line 127
    const/16 v0, 0x800

    .line 128
    .line 129
    if-le p4, v0, :cond_c

    .line 130
    .line 131
    invoke-interface {p5, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 132
    .line 133
    .line 134
    move-result p4

    .line 135
    if-nez p4, :cond_d

    .line 136
    .line 137
    :cond_c
    and-int/lit16 p4, p6, 0xc00

    .line 138
    .line 139
    if-ne p4, v0, :cond_e

    .line 140
    .line 141
    :cond_d
    move p4, p7

    .line 142
    goto :goto_3

    .line 143
    :cond_e
    move p4, p0

    .line 144
    :goto_3
    or-int/2addr p3, p4

    .line 145
    const p4, 0xe000

    .line 146
    .line 147
    .line 148
    and-int/2addr p4, p6

    .line 149
    xor-int/lit16 p4, p4, 0x6000

    .line 150
    .line 151
    const/16 v0, 0x4000

    .line 152
    .line 153
    if-le p4, v0, :cond_f

    .line 154
    .line 155
    invoke-interface {p5, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p4

    .line 159
    if-nez p4, :cond_10

    .line 160
    .line 161
    :cond_f
    and-int/lit16 p4, p6, 0x6000

    .line 162
    .line 163
    if-ne p4, v0, :cond_11

    .line 164
    .line 165
    :cond_10
    move p0, p7

    .line 166
    :cond_11
    or-int/2addr p0, p3

    .line 167
    invoke-interface {p5, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result p3

    .line 171
    or-int/2addr p0, p3

    .line 172
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    if-nez p0, :cond_12

    .line 177
    .line 178
    sget-object p0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 179
    .line 180
    invoke-virtual {p0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    if-ne p3, p0, :cond_13

    .line 185
    .line 186
    :cond_12
    new-instance v0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;

    .line 187
    .line 188
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;-><init>(Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {p5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    move-object p3, v0

    .line 195
    :cond_13
    move-object p4, p3

    .line 196
    check-cast p4, Lr6/a;

    .line 197
    .line 198
    const/4 p6, 0x0

    .line 199
    const/4 p7, 0x4

    .line 200
    const/4 p3, 0x0

    .line 201
    invoke-static/range {p1 .. p7}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    check-cast p0, Landroidx/compose/material3/DatePickerStateImpl;

    .line 206
    .line 207
    invoke-virtual {p0, v5}, Landroidx/compose/material3/BaseDatePickerStateImpl;->setSelectableDates(Landroidx/compose/material3/SelectableDates;)V

    .line 208
    .line 209
    .line 210
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_14

    .line 215
    .line 216
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 217
    .line 218
    .line 219
    :cond_14
    return-object p0
.end method

.method public static final updateDisplayedMonth(Landroidx/compose/foundation/lazy/LazyListState;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Lh6/c;)Ljava/lang/Object;
    .locals 2
    .param p0    # Landroidx/compose/foundation/lazy/LazyListState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/internal/CalendarModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lx6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Lr6/c;",
            "Landroidx/compose/material3/internal/CalendarModel;",
            "Lx6/f;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$2;-><init>(Landroidx/compose/foundation/lazy/LazyListState;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lr6/a;)Lkotlinx/coroutines/flow/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1, p4}, Lkotlinx/coroutines/flow/f;->collect(Lkotlinx/coroutines/flow/g;Lh6/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 20
    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 25
    .line 26
    return-object p0
.end method
