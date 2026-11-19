.class public Lcom/zykj/video/play/view/TCPointSeekBar$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/view/TCPointSeekBar;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/view/TCPointSeekBar;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/view/TCPointSeekBar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->b(Lcom/zykj/video/play/view/TCPointSeekBar;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->d(Lcom/zykj/video/play/view/TCPointSeekBar;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    move v0, v1

    .line 24
    :goto_0
    iget-object v2, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 25
    .line 26
    invoke-static {v2}, Lcom/zykj/video/play/view/TCPointSeekBar;->d(Lcom/zykj/video/play/view/TCPointSeekBar;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-ge v0, v2, :cond_0

    .line 35
    .line 36
    iget-object v2, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 37
    .line 38
    invoke-static {v2}, Lcom/zykj/video/play/view/TCPointSeekBar;->d(Lcom/zykj/video/play/view/TCPointSeekBar;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lcom/zykj/video/play/view/TCPointSeekBar$f;

    .line 47
    .line 48
    iget-object v3, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 49
    .line 50
    invoke-virtual {v3, v2, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->i(Lcom/zykj/video/play/view/TCPointSeekBar$f;I)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 57
    .line 58
    invoke-static {v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->a(Lcom/zykj/video/play/view/TCPointSeekBar;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 62
    .line 63
    invoke-static {v0, v1}, Lcom/zykj/video/play/view/TCPointSeekBar;->c(Lcom/zykj/video/play/view/TCPointSeekBar;Z)Z

    .line 64
    .line 65
    .line 66
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 67
    .line 68
    invoke-static {v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->e(Lcom/zykj/video/play/view/TCPointSeekBar;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 75
    .line 76
    invoke-static {v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->f(Lcom/zykj/video/play/view/TCPointSeekBar;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$b;->a:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 80
    .line 81
    invoke-static {v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->g(Lcom/zykj/video/play/view/TCPointSeekBar;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    return-void
.end method
