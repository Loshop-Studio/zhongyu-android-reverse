.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ld6/d;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/zykj/mistake/main/MainShellViewModel;Lo2/a;ZLr6/a;Lr6/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->e:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->f:Ljava/lang/Object;

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->b:Z

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->g:Ld6/d;

    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->h:Ljava/lang/Object;

    iput p7, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;ZI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->e:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->f:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->h:Ljava/lang/Object;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->g:Ld6/d;

    iput-boolean p6, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->b:Z

    iput p7, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->d:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Landroidx/navigation/NavHostController;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->e:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->f:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Lo2/a;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->g:Ld6/d;

    .line 22
    .line 23
    move-object v5, v0

    .line 24
    check-cast v5, Lr6/a;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->h:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v6, v0

    .line 29
    check-cast v6, Lr6/a;

    .line 30
    .line 31
    move-object v7, p1

    .line 32
    check-cast v7, Landroidx/compose/runtime/Composer;

    .line 33
    .line 34
    check-cast p2, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->c:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->b:Z

    .line 48
    .line 49
    invoke-static/range {v1 .. v8}, Lcom/zykj/mistake/main/k;->a(Landroidx/navigation/NavHostController;Lcom/zykj/mistake/main/MainShellViewModel;Lo2/a;ZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 50
    .line 51
    .line 52
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->d:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v1, v0

    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->e:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v2, v0

    .line 63
    check-cast v2, Ljava/util/List;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->f:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v3, v0

    .line 68
    check-cast v3, Lr6/c;

    .line 69
    .line 70
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->h:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v4, v0

    .line 73
    check-cast v4, Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 74
    .line 75
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->g:Ld6/d;

    .line 76
    .line 77
    move-object v5, v0

    .line 78
    check-cast v5, Lr6/c;

    .line 79
    .line 80
    move-object v7, p1

    .line 81
    check-cast v7, Landroidx/compose/runtime/Composer;

    .line 82
    .line 83
    check-cast p2, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->c:I

    .line 89
    .line 90
    or-int/lit8 p1, p1, 0x1

    .line 91
    .line 92
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    iget-boolean v6, p0, Lcom/zykj/mistake/feature/notebook/detail/k;->b:Z

    .line 97
    .line 98
    invoke-static/range {v1 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/t;->d(Ljava/lang/String;Ljava/util/List;Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;ZLandroidx/compose/runtime/Composer;I)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
