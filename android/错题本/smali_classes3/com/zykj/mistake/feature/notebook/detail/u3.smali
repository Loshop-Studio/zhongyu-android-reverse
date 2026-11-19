.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/u3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/l3;ZILr6/a;Lr6/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->e:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->b:Z

    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->c:I

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->f:Ljava/lang/Object;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->g:Ljava/lang/Object;

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZII)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->e:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->f:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->g:Ljava/lang/Object;

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->b:Z

    iput p5, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->c:I

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLr6/a;Lr6/a;II)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->e:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->b:Z

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->f:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->g:Ljava/lang/Object;

    iput p5, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->c:I

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->e:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->f:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lr6/a;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->g:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Lr6/a;

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->c:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->b:Z

    .line 38
    .line 39
    iget v7, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->d:I

    .line 40
    .line 41
    invoke-static/range {v1 .. v7}, Lcom/zykj/mistake/main/drawer/l;->d(Ljava/lang/String;ZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;II)V

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
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->e:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->f:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v2, v0

    .line 55
    check-cast v2, Landroidx/compose/ui/Modifier;

    .line 56
    .line 57
    move-object v5, p1

    .line 58
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 59
    .line 60
    check-cast p2, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->c:I

    .line 66
    .line 67
    or-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->g:Ljava/lang/Object;

    .line 74
    .line 75
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->b:Z

    .line 76
    .line 77
    iget v7, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->d:I

    .line 78
    .line 79
    invoke-static/range {v1 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/q4;->e(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZLandroidx/compose/runtime/Composer;II)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->e:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v1, v0

    .line 86
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 87
    .line 88
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->f:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v4, v0

    .line 91
    check-cast v4, Lr6/a;

    .line 92
    .line 93
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->g:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v5, v0

    .line 96
    check-cast v5, Lr6/a;

    .line 97
    .line 98
    move-object v6, p1

    .line 99
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 100
    .line 101
    check-cast p2, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->d:I

    .line 107
    .line 108
    or-int/lit8 p1, p1, 0x1

    .line 109
    .line 110
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->b:Z

    .line 115
    .line 116
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/u3;->c:I

    .line 117
    .line 118
    invoke-static/range {v1 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/x3;->k(Lcom/zykj/mistake/feature/notebook/detail/l3;ZILr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
