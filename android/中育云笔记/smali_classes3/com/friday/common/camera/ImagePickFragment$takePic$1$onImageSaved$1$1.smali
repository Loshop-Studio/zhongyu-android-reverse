.class final Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.camera.ImagePickFragment$takePic$1$onImageSaved$1$1"
    f = "ImagePickFragment.kt"
    l = {
        0x9f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public g:I

.field public final synthetic h:Lcom/friday/common/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/camera/ImagePickFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->h:Lcom/friday/common/camera/ImagePickFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->h:Lcom/friday/common/camera/ImagePickFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;-><init>(Lcom/friday/common/camera/ImagePickFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->g:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lcom/friday/common/camera/CameraBean;

    .line 18
    .line 19
    iget-object v1, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lcom/friday/common/camera/ImagePickFragment;

    .line 22
    .line 23
    iget-object v2, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lcom/friday/common/camera/CameraBean;

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object/from16 v5, p1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->h:Lcom/friday/common/camera/ImagePickFragment;

    .line 45
    .line 46
    invoke-static {v2}, Lcom/friday/common/camera/ImagePickFragment;->y(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/camera/CameraBean;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    iget-object v2, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->h:Lcom/friday/common/camera/ImagePickFragment;

    .line 53
    .line 54
    invoke-virtual {v5}, Lcom/friday/common/camera/CameraBean;->l()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_3

    .line 59
    .line 60
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    new-instance v7, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;

    .line 65
    .line 66
    invoke-direct {v7, v5, v3}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;-><init>(Lcom/friday/common/camera/CameraBean;Lvc/c;)V

    .line 67
    .line 68
    .line 69
    iput-object v5, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->c:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v2, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->d:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iput-object v5, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->e:Ljava/lang/Object;

    .line 78
    .line 79
    const/4 v5, 0x0

    .line 80
    iput v5, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->f:I

    .line 81
    .line 82
    iput v4, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->g:I

    .line 83
    .line 84
    invoke-static {v6, v7, v0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    if-ne v5, v1, :cond_2

    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_2
    move-object v1, v2

    .line 92
    :goto_0
    check-cast v5, Landroid/graphics/Bitmap;

    .line 93
    .line 94
    const-string v2, "key_class_bitmap"

    .line 95
    .line 96
    const-class v6, Landroid/graphics/Bitmap;

    .line 97
    .line 98
    invoke-static {v2, v6}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-interface {v2, v5}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    sget-object v1, Lcom/friday/common/camera/CameraActivity;->i:Lcom/friday/common/camera/CameraActivity$a;

    .line 114
    .line 115
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    const-string v7, "requireContext(...)"

    .line 120
    .line 121
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const/16 v14, 0xfe

    .line 125
    .line 126
    const/4 v15, 0x0

    .line 127
    move-object v7, v6

    .line 128
    const/4 v6, 0x1

    .line 129
    move-object v8, v7

    .line 130
    const/4 v7, 0x0

    .line 131
    move-object v9, v8

    .line 132
    const/4 v8, 0x0

    .line 133
    move-object v10, v9

    .line 134
    const/4 v9, 0x0

    .line 135
    move-object v11, v10

    .line 136
    const/4 v10, 0x0

    .line 137
    move-object v12, v11

    .line 138
    const/4 v11, 0x0

    .line 139
    move-object v13, v12

    .line 140
    const/4 v12, 0x0

    .line 141
    move-object/from16 v16, v13

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    move-object/from16 v3, v16

    .line 145
    .line 146
    invoke-static/range {v5 .. v15}, Lcom/friday/common/camera/CameraBean;->b(Lcom/friday/common/camera/CameraBean;ILjava/lang/String;ZIIZLjava/lang/String;IILjava/lang/Object;)Lcom/friday/common/camera/CameraBean;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-virtual {v1, v3, v5}, Lcom/friday/common/camera/CameraActivity$a;->a(Landroid/content/Context;Lcom/friday/common/camera/CameraBean;)Landroid/content/Intent;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 155
    .line 156
    .line 157
    :cond_4
    :goto_1
    iget-object v1, v0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->h:Lcom/friday/common/camera/ImagePickFragment;

    .line 158
    .line 159
    invoke-static {v1}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    if-nez v1, :cond_5

    .line 164
    .line 165
    const-string v1, "mBindView"

    .line 166
    .line 167
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const/4 v3, 0x0

    .line 171
    goto :goto_2

    .line 172
    :cond_5
    move-object v3, v1

    .line 173
    :goto_2
    iget-object v1, v3, Lcom/friday/common/databinding/FragmentImagePickBinding;->d:Landroid/widget/ImageView;

    .line 174
    .line 175
    invoke-virtual {v1, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 176
    .line 177
    .line 178
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 179
    .line 180
    return-object v1
.end method
