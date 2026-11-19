.class public final synthetic Lcom/zykj/mistake/feature/ask/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lr6/a;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Enum;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Lcom/zykj/mistake/feature/ask/y;Landroidx/compose/ui/Modifier;ZLr6/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/feature/ask/g0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/g0;->e:Ljava/lang/Enum;

    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/g0;->f:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/g0;->g:Ljava/lang/Object;

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/ask/g0;->b:Z

    iput-object p5, p0, Lcom/zykj/mistake/feature/ask/g0;->c:Lr6/a;

    iput p6, p0, Lcom/zykj/mistake/feature/ask/g0;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;ZLr6/a;Lr6/c;Lr6/a;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/ask/g0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/g0;->e:Ljava/lang/Enum;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/ask/g0;->b:Z

    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/g0;->c:Lr6/a;

    iput-object p4, p0, Lcom/zykj/mistake/feature/ask/g0;->f:Ljava/lang/Object;

    iput-object p5, p0, Lcom/zykj/mistake/feature/ask/g0;->g:Ljava/lang/Object;

    iput p6, p0, Lcom/zykj/mistake/feature/ask/g0;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/ask/g0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/g0;->e:Ljava/lang/Enum;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/g0;->f:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lr6/c;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/g0;->g:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v5, v0

    .line 19
    check-cast v5, Lr6/a;

    .line 20
    .line 21
    move-object v6, p1

    .line 22
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    iget p1, p0, Lcom/zykj/mistake/feature/ask/g0;->d:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/ask/g0;->b:Z

    .line 38
    .line 39
    iget-object v3, p0, Lcom/zykj/mistake/feature/ask/g0;->c:Lr6/a;

    .line 40
    .line 41
    invoke-static/range {v1 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/g0;->f(Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;ZLr6/a;Lr6/c;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 42
    .line 43
    .line 44
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/g0;->e:Ljava/lang/Enum;

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    check-cast v1, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 51
    .line 52
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/g0;->f:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v2, v0

    .line 55
    check-cast v2, Lcom/zykj/mistake/feature/ask/y;

    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/g0;->g:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v3, v0

    .line 60
    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 61
    .line 62
    move-object v6, p1

    .line 63
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 64
    .line 65
    check-cast p2, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget p1, p0, Lcom/zykj/mistake/feature/ask/g0;->d:I

    .line 71
    .line 72
    or-int/lit8 p1, p1, 0x1

    .line 73
    .line 74
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/ask/g0;->b:Z

    .line 79
    .line 80
    iget-object v5, p0, Lcom/zykj/mistake/feature/ask/g0;->c:Lr6/a;

    .line 81
    .line 82
    invoke-static/range {v1 .. v7}, Lcom/zykj/mistake/feature/ask/o0;->e(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Lcom/zykj/mistake/feature/ask/y;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
