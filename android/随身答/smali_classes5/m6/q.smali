.class public final synthetic Lm6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Z

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6/q;->a:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lm6/q;->b:Z

    iput-object p3, p0, Lm6/q;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lm6/q;->d:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lm6/q;->e:I

    iput p6, p0, Lm6/q;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lm6/q;->a:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lm6/q;->b:Z

    iget-object v2, p0, Lm6/q;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lm6/q;->d:Lkotlin/jvm/functions/Function0;

    iget v4, p0, Lm6/q;->e:I

    iget v5, p0, Lm6/q;->f:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogScreensKt;->a(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
