.class public final synthetic Lr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:D

.field public final synthetic d:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(DLandroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lr/c;->c:D

    iput-object p3, p0, Lr/c;->d:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-wide v0, p0, Lr/c;->c:D

    iget-object v2, p0, Lr/c;->d:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lr/d$a;->a(DLandroid/content/Context;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
