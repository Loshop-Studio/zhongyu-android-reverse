.class public final Landroidx/compose/ui/text/Savers_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LineBreakSaver:Landroidx/compose/runtime/saveable/Saver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/ui/text/style/LineBreak;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final PlatformParagraphStyleSaver:Landroidx/compose/runtime/saveable/Saver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/ui/text/PlatformParagraphStyle;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final TextMotionSaver:Landroidx/compose/runtime/saveable/Saver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/ui/text/style/TextMotion;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/ui/text/Savers_androidKt$PlatformParagraphStyleSaver$1;->INSTANCE:Landroidx/compose/ui/text/Savers_androidKt$PlatformParagraphStyleSaver$1;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/ui/text/Savers_androidKt$PlatformParagraphStyleSaver$2;->INSTANCE:Landroidx/compose/ui/text/Savers_androidKt$PlatformParagraphStyleSaver$2;

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/SaverKt;->Saver(Lhd/p;Lhd/l;)Landroidx/compose/runtime/saveable/Saver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Landroidx/compose/ui/text/Savers_androidKt;->PlatformParagraphStyleSaver:Landroidx/compose/runtime/saveable/Saver;

    .line 10
    .line 11
    sget-object v0, Landroidx/compose/ui/text/Savers_androidKt$LineBreakSaver$1;->INSTANCE:Landroidx/compose/ui/text/Savers_androidKt$LineBreakSaver$1;

    .line 12
    .line 13
    sget-object v1, Landroidx/compose/ui/text/Savers_androidKt$LineBreakSaver$2;->INSTANCE:Landroidx/compose/ui/text/Savers_androidKt$LineBreakSaver$2;

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/SaverKt;->Saver(Lhd/p;Lhd/l;)Landroidx/compose/runtime/saveable/Saver;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Landroidx/compose/ui/text/Savers_androidKt;->LineBreakSaver:Landroidx/compose/runtime/saveable/Saver;

    .line 20
    .line 21
    sget-object v0, Landroidx/compose/ui/text/Savers_androidKt$TextMotionSaver$1;->INSTANCE:Landroidx/compose/ui/text/Savers_androidKt$TextMotionSaver$1;

    .line 22
    .line 23
    sget-object v1, Landroidx/compose/ui/text/Savers_androidKt$TextMotionSaver$2;->INSTANCE:Landroidx/compose/ui/text/Savers_androidKt$TextMotionSaver$2;

    .line 24
    .line 25
    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/SaverKt;->Saver(Lhd/p;Lhd/l;)Landroidx/compose/runtime/saveable/Saver;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Landroidx/compose/ui/text/Savers_androidKt;->TextMotionSaver:Landroidx/compose/runtime/saveable/Saver;

    .line 30
    .line 31
    return-void
.end method

.method public static final getSaver(Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;",
            ")",
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/ui/text/PlatformParagraphStyle;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Landroidx/compose/ui/text/Savers_androidKt;->PlatformParagraphStyleSaver:Landroidx/compose/runtime/saveable/Saver;

    return-object p0
.end method

.method public static final getSaver(Landroidx/compose/ui/text/style/LineBreak$Companion;)Landroidx/compose/runtime/saveable/Saver;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/style/LineBreak$Companion;",
            ")",
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/ui/text/style/LineBreak;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    sget-object p0, Landroidx/compose/ui/text/Savers_androidKt;->LineBreakSaver:Landroidx/compose/runtime/saveable/Saver;

    return-object p0
.end method

.method public static final getSaver(Landroidx/compose/ui/text/style/TextMotion$Companion;)Landroidx/compose/runtime/saveable/Saver;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/style/TextMotion$Companion;",
            ")",
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/ui/text/style/TextMotion;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 3
    sget-object p0, Landroidx/compose/ui/text/Savers_androidKt;->TextMotionSaver:Landroidx/compose/runtime/saveable/Saver;

    return-object p0
.end method
