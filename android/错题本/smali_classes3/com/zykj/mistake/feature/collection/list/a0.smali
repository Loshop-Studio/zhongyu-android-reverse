.class public final Lcom/zykj/mistake/feature/collection/list/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/widget/StemWebView;Lkotlinx/coroutines/g;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/mistake/utils/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/zykj/mistake/feature/collection/list/a0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/list/a0;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/list/a0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/list/a0;->c:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/list/a0;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lr6/c;Ljava/lang/Object;Lr6/c;I)V
    .locals 0

    .line 2
    iput p5, p0, Lcom/zykj/mistake/feature/collection/list/a0;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/list/a0;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/list/a0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/list/a0;->e:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/list/a0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/list/a0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/a0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/zykj/mistake/widget/StemWebView;

    .line 9
    .line 10
    new-instance v1, Lcom/zykj/mistake/utils/b;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/list/a0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lkotlinx/coroutines/g;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/list/a0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 19
    .line 20
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/list/a0;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Lcom/zykj/mistake/utils/c;

    .line 23
    .line 24
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/zykj/mistake/utils/b;-><init>(Lcom/zykj/mistake/widget/StemWebView;Lkotlinx/coroutines/g;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/mistake/utils/c;)V

    .line 25
    .line 26
    .line 27
    const-wide/16 v2, 0x12c

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    .line 31
    .line 32
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/a0;->e:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lp4/b;

    .line 38
    .line 39
    iget-object v0, v0, Lp4/b;->a:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/a0;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 44
    .line 45
    iget-boolean v1, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->i:Z

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/a0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lr6/c;

    .line 52
    .line 53
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/c1;

    .line 54
    .line 55
    invoke-direct {v2, v0}, Lcom/zykj/mistake/feature/notebook/list/c1;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/a0;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lr6/c;

    .line 65
    .line 66
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/a0;->e:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lcom/zykj/mistake/feature/collection/list/b;

    .line 75
    .line 76
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/list/b;->a:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/a0;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lcom/zykj/mistake/feature/collection/list/v;

    .line 81
    .line 82
    iget-boolean v1, v1, Lcom/zykj/mistake/feature/collection/list/v;->k:Z

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/a0;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Lr6/c;

    .line 89
    .line 90
    new-instance v2, Lcom/zykj/mistake/feature/collection/list/t;

    .line 91
    .line 92
    invoke-direct {v2, v0}, Lcom/zykj/mistake/feature/collection/list/t;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/a0;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Lr6/c;

    .line 102
    .line 103
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :goto_1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
