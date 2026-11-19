.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;II)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->b:Ljava/util/List;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    iput p4, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->a:I

    .line 2
    .line 3
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget p2, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->e:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->b:Ljava/util/List;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->c:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 26
    .line 27
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/t;->v(Ljava/util/List;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;Landroidx/compose/runtime/Composer;I)V

    .line 28
    .line 29
    .line 30
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_0
    iget p2, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->e:I

    .line 34
    .line 35
    or-int/lit8 p2, p2, 0x1

    .line 36
    .line 37
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->b:Ljava/util/List;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->c:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/p;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 46
    .line 47
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/t;->v(Ljava/util/List;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;Landroidx/compose/runtime/Composer;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
