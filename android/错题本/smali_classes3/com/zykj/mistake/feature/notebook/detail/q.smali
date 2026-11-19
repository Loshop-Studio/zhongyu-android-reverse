.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/q;->a:Ljava/util/ArrayList;

    iput-wide p2, p0, Lcom/zykj/mistake/feature/notebook/detail/q;->b:J

    iput-wide p4, p0, Lcom/zykj/mistake/feature/notebook/detail/q;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Landroidx/compose/foundation/layout/FlowRowScope;

    .line 2
    .line 3
    move-object v5, p2

    .line 4
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const-string p3, "$this$FlowRow"

    .line 13
    .line 14
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    and-int/lit8 p1, p2, 0x11

    .line 18
    .line 19
    const/16 p3, 0x10

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    if-eq p1, p3, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v0

    .line 27
    :goto_0
    and-int/lit8 p3, p2, 0x1

    .line 28
    .line 29
    invoke-interface {v5, p1, p3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    const/4 p1, -0x1

    .line 42
    const-string p3, "com.zykj.mistake.feature.notebook.detail.TextAnswerContent.<anonymous> (MistakeDetailAnswerPanel.kt:739)"

    .line 43
    .line 44
    const v1, -0x15268081

    .line 45
    .line 46
    .line 47
    invoke-static {v1, p2, p1, p3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/q;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    :goto_1
    if-ge v0, p2, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    add-int/lit8 v7, v0, 0x1

    .line 63
    .line 64
    move-object v0, p3

    .line 65
    check-cast v0, Ljava/lang/String;

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    iget-wide v1, p0, Lcom/zykj/mistake/feature/notebook/detail/q;->b:J

    .line 69
    .line 70
    iget-wide v3, p0, Lcom/zykj/mistake/feature/notebook/detail/q;->c:J

    .line 71
    .line 72
    invoke-static/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/t;->u(Ljava/lang/String;JJLandroidx/compose/runtime/Composer;I)V

    .line 73
    .line 74
    .line 75
    move v0, v7

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 88
    .line 89
    .line 90
    :cond_4
    :goto_2
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 91
    .line 92
    return-object p1
.end method
