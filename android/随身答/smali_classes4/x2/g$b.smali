.class public Lx2/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx2/g;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx2/g;


# direct methods
.method public constructor <init>(Lx2/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx2/g$b;->a:Lx2/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "--->>> onImprintValueChanged: key="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "; value= "

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "MobclickRT"

    .line 27
    .line 28
    invoke-static {p2, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/umeng/commonsdk/config/a;->b()Lcom/umeng/commonsdk/config/a;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p2, p0, Lx2/g$b;->a:Lx2/g;

    .line 36
    .line 37
    invoke-static {p2}, Lx2/g;->a(Lx2/g;)Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p2}, Lcom/umeng/commonsdk/config/a;->c(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lx2/g$b;->a:Lx2/g;

    .line 45
    .line 46
    invoke-static {p1}, Lx2/g;->a(Lx2/g;)Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p2, p0, Lx2/g$b;->a:Lx2/g;

    .line 51
    .line 52
    invoke-static {p2}, Lx2/g;->a(Lx2/g;)Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-static {p2}, Lo2/b;->a(Landroid/content/Context;)Lo2/b;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Lo2/b;->b()Lo2/c;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    const/4 v0, 0x0

    .line 65
    const v1, 0x8010

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v1, p2, v0}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lx2/g$b;->a:Lx2/g;

    .line 72
    .line 73
    invoke-static {p1}, Lx2/g;->a(Lx2/g;)Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, Lw2/b;->u(Landroid/content/Context;)Lw2/b;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string p2, "iscfg"

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lw2/b;->g(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x1

    .line 87
    return p1
.end method
