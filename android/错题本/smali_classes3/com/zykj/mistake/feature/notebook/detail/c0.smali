.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/a5;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/a5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/feature/notebook/detail/c0;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/c0;->b:Lcom/zykj/mistake/feature/notebook/detail/a5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/c0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/c0;->b:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 7
    .line 8
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->o:Z

    .line 14
    .line 15
    :cond_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/c0;->b:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 19
    .line 20
    iget v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->e:F

    .line 21
    .line 22
    const v2, 0x3dcccccd    # 0.1f

    .line 23
    .line 24
    .line 25
    sub-float/2addr v1, v2

    .line 26
    const/high16 v2, 0x3f800000    # 1.0f

    .line 27
    .line 28
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 29
    .line 30
    invoke-static {v1, v2, v3}, Lkotlin/collections/u;->l(FFF)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->e:F

    .line 35
    .line 36
    cmpg-float v2, v1, v2

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setScale(F)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v3, 0x1

    .line 50
    if-ne v2, v3, :cond_2

    .line 51
    .line 52
    iput v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->e:F

    .line 53
    .line 54
    :cond_2
    :goto_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/c0;->b:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 58
    .line 59
    iget v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->e:F

    .line 60
    .line 61
    const v2, 0x3dcccccd    # 0.1f

    .line 62
    .line 63
    .line 64
    add-float/2addr v1, v2

    .line 65
    const/high16 v2, 0x3f800000    # 1.0f

    .line 66
    .line 67
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 68
    .line 69
    invoke-static {v1, v2, v3}, Lkotlin/collections/u;->l(FFF)F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->e:F

    .line 74
    .line 75
    cmpg-float v2, v1, v2

    .line 76
    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 81
    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    invoke-virtual {v2, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setScale(F)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    const/4 v3, 0x1

    .line 89
    if-ne v2, v3, :cond_4

    .line 90
    .line 91
    iput v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->e:F

    .line 92
    .line 93
    :cond_4
    :goto_1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_2
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/c0;->b:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 97
    .line 98
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->clean()V

    .line 103
    .line 104
    .line 105
    :cond_5
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 106
    .line 107
    return-object v0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
