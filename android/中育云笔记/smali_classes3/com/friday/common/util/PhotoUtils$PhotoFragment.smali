.class public final Lcom/friday/common/util/PhotoUtils$PhotoFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/util/PhotoUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PhotoFragment"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/util/PhotoUtils$PhotoFragment$a;
    }
.end annotation


# static fields
.field public static final i:Lcom/friday/common/util/PhotoUtils$PhotoFragment$a;

.field public static final j:I


# instance fields
.field public d:Lhd/q;

.field public e:Lhd/q;

.field public f:Lhd/q;

.field public g:Ljava/lang/String;

.field public h:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/util/PhotoUtils$PhotoFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/util/PhotoUtils$PhotoFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->i:Lcom/friday/common/util/PhotoUtils$PhotoFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->j:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->g:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "cameraPath"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-ne p2, v0, :cond_4

    .line 7
    .line 8
    const-string p2, ""

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :pswitch_0
    if-eqz p3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, v1

    .line 22
    :goto_0
    iget-object p3, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->e:Lhd/q;

    .line 23
    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-interface {p3, p1, v0, p2}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object v1, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->e:Lhd/q;

    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {}, Lcom/friday/common/util/PhotoUtils;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    new-instance v0, Ljava/io/File;

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->o()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p3, v0}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p3, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->f:Lhd/q;

    .line 56
    .line 57
    if-eqz p3, :cond_2

    .line 58
    .line 59
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-interface {p3, p1, v0, p2}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_2
    iput-object v1, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->f:Lhd/q;

    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_2
    iget-object p1, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->d:Lhd/q;

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    iget-object p3, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->h:Landroid/net/Uri;

    .line 72
    .line 73
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-interface {p1, p3, v0, p2}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :cond_3
    iput-object v1, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->d:Lhd/q;

    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    packed-switch p1, :pswitch_data_1

    .line 82
    .line 83
    .line 84
    :goto_1
    return-void

    .line 85
    :pswitch_3
    iget-object p1, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->e:Lhd/q;

    .line 86
    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    const-string p3, "\u9009\u62e9\u56fe\u7247\u5931\u8d25"

    .line 92
    .line 93
    invoke-interface {p1, v1, p2, p3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :cond_5
    iput-object v1, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->e:Lhd/q;

    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_4
    iget-object p1, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->f:Lhd/q;

    .line 100
    .line 101
    if-eqz p1, :cond_6

    .line 102
    .line 103
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 104
    .line 105
    const-string p3, "\u62cd\u7167\u5931\u8d25"

    .line 106
    .line 107
    invoke-interface {p1, v1, p2, p3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    :cond_6
    iput-object v1, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->f:Lhd/q;

    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_5
    iget-object p1, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->d:Lhd/q;

    .line 114
    .line 115
    if-eqz p1, :cond_7

    .line 116
    .line 117
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 118
    .line 119
    const-string p3, "\u88c1\u526a\u5931\u8d25"

    .line 120
    .line 121
    invoke-interface {p1, v1, p2, p3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :cond_7
    iput-object v1, p0, Lcom/friday/common/util/PhotoUtils$PhotoFragment;->d:Lhd/q;

    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_data_0
    .packed-switch 0x259
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    :pswitch_data_1
    .packed-switch 0x259
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->setRetainInstance(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-virtual {p1, p2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
