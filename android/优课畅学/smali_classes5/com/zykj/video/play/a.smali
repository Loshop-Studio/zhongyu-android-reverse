.class public Lcom/zykj/video/play/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/video/play/a$a;
    }
.end annotation


# static fields
.field public static g:Lcom/zykj/video/play/a;


# instance fields
.field public a:Z

.field public b:Lcom/zykj/video/play/a$a;

.field public c:Z

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/zykj/video/play/a;->a:Z

    .line 6
    .line 7
    new-instance v1, Lcom/zykj/video/play/a$a;

    .line 8
    .line 9
    const/16 v2, 0x32a

    .line 10
    .line 11
    const/16 v3, 0x21c

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-direct {v1, v4, v4, v2, v3}, Lcom/zykj/video/play/a$a;-><init>(IIII)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/zykj/video/play/a;->b:Lcom/zykj/video/play/a$a;

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/zykj/video/play/a;->c:Z

    .line 20
    .line 21
    iput v0, p0, Lcom/zykj/video/play/a;->d:I

    .line 22
    .line 23
    const/4 v0, 0x5

    .line 24
    iput v0, p0, Lcom/zykj/video/play/a;->e:I

    .line 25
    .line 26
    const-string v0, "liteavapp.timeshift.qcloud.com"

    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/video/play/a;->f:Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method

.method public static a()Lcom/zykj/video/play/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/video/play/a;->g:Lcom/zykj/video/play/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/video/play/a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/video/play/a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/video/play/a;->g:Lcom/zykj/video/play/a;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/zykj/video/play/a;->g:Lcom/zykj/video/play/a;

    .line 13
    .line 14
    return-object v0
.end method
