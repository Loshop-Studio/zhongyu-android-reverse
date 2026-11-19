.class public Lg5/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg5/f;->k(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg5/f;


# direct methods
.method public constructor <init>(Lg5/f;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg5/f$b;->b:Lg5/f;

    .line 2
    .line 3
    iput p2, p0, Lg5/f$b;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lg5/f$b;->b:Lg5/f;

    .line 2
    .line 3
    iget v1, p0, Lg5/f$b;->a:I

    .line 4
    .line 5
    invoke-static {v1}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iput-object v1, v0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 10
    .line 11
    iget-object v0, p0, Lg5/f$b;->b:Lg5/f;

    .line 12
    .line 13
    iget-object v1, v0, Lg5/f;->b:Lg5/c;

    .line 14
    .line 15
    iget-object v0, v0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lg5/c;->setCamera(Landroid/hardware/Camera;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lg5/f$b;->b:Lg5/f;

    .line 21
    .line 22
    iget-object v0, v0, Lg5/f;->b:Lg5/c;

    .line 23
    .line 24
    invoke-virtual {v0}, Lg5/c;->getPicSize()Landroid/graphics/Point;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 29
    .line 30
    int-to-float v1, v1

    .line 31
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 32
    .line 33
    int-to-float v0, v0

    .line 34
    div-float/2addr v1, v0

    .line 35
    iget-object v0, p0, Lg5/f$b;->b:Lg5/f;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    int-to-float v0, v0

    .line 42
    mul-float/2addr v0, v1

    .line 43
    float-to-int v0, v0

    .line 44
    iget-object v1, p0, Lg5/f$b;->b:Lg5/f;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 51
    .line 52
    iget-object v0, p0, Lg5/f$b;->b:Lg5/f;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lg5/f$b;->b:Lg5/f;

    .line 58
    .line 59
    iget-object v0, v0, Lg5/f;->b:Lg5/c;

    .line 60
    .line 61
    invoke-virtual {v0}, Lg5/c;->p()V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lg5/f$b;->b:Lg5/f;

    .line 65
    .line 66
    invoke-static {v0}, Lg5/f;->c(Lg5/f;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {v0, v1}, Lg5/f;->b(Lg5/f;Z)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lg5/f$b;->b:Lg5/f;

    .line 74
    .line 75
    iget-object v1, v0, Lg5/f;->j:Landroid/widget/ImageView;

    .line 76
    .line 77
    invoke-static {v0}, Lg5/f;->c(Lg5/f;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setSelected(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catch_0
    move-exception v0

    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v2, "\u76f8\u673a\u8c03\u7528\u51fa\u9519-->>"

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v1, "QRCodeView"

    .line 108
    .line 109
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lg5/f$b;->b:Lg5/f;

    .line 113
    .line 114
    iget-object v0, v0, Lg5/f;->d:Lg5/f$d;

    .line 115
    .line 116
    if-eqz v0, :cond_0

    .line 117
    .line 118
    invoke-interface {v0}, Lg5/f$d;->c()V

    .line 119
    .line 120
    .line 121
    :cond_0
    return-void
.end method
