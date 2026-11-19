.class public Lcom/umeng/analytics/pro/bd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final a:B

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Z


# direct methods
.method public constructor <init>(B)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/pro/bd;-><init>(BZ)V

    return-void
.end method

.method public constructor <init>(BZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-byte p1, p0, Lcom/umeng/analytics/pro/bd;->a:B

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/bd;->b:Z

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/bd;->c:Ljava/lang/String;

    .line 5
    iput-boolean p2, p0, Lcom/umeng/analytics/pro/bd;->d:Z

    return-void
.end method
