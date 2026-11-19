.class public final synthetic Lcom/zykj/mistake/feature/collection/filter/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ld6/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZZZLd6/d;II)V
    .locals 0

    .line 1
    iput p7, p0, Lcom/zykj/mistake/feature/collection/filter/e;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/e;->f:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/collection/filter/e;->b:Z

    iput-boolean p3, p0, Lcom/zykj/mistake/feature/collection/filter/e;->c:Z

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/collection/filter/e;->d:Z

    iput-object p5, p0, Lcom/zykj/mistake/feature/collection/filter/e;->g:Ld6/d;

    iput p6, p0, Lcom/zykj/mistake/feature/collection/filter/e;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/e;->f:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/e;->g:Ld6/d;

    .line 12
    .line 13
    move-object v5, v0

    .line 14
    check-cast v5, Lr6/c;

    .line 15
    .line 16
    move-object v6, p1

    .line 17
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lcom/zykj/mistake/feature/collection/filter/e;->e:I

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/filter/e;->b:Z

    .line 33
    .line 34
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/filter/e;->c:Z

    .line 35
    .line 36
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/filter/e;->d:Z

    .line 37
    .line 38
    invoke-static/range {v1 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/n0;->b(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/e;->f:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v1, v0

    .line 47
    check-cast v1, Ljava/lang/String;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/e;->g:Ld6/d;

    .line 50
    .line 51
    move-object v5, v0

    .line 52
    check-cast v5, Lr6/a;

    .line 53
    .line 54
    move-object v6, p1

    .line 55
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 56
    .line 57
    check-cast p2, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget p1, p0, Lcom/zykj/mistake/feature/collection/filter/e;->e:I

    .line 63
    .line 64
    or-int/lit8 p1, p1, 0x1

    .line 65
    .line 66
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/filter/e;->b:Z

    .line 71
    .line 72
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/filter/e;->c:Z

    .line 73
    .line 74
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/filter/e;->d:Z

    .line 75
    .line 76
    invoke-static/range {v1 .. v7}, Lcom/zykj/mistake/feature/collection/filter/i;->b(Ljava/lang/String;ZZZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
