.class public final Ln9/n$c;
.super Lokio/AsyncTimeout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln9/n;-><init>(Li9/a0;Li9/b0;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ln9/n;


# direct methods
.method public constructor <init>(Ln9/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln9/n$c;->a:Ln9/n;

    .line 2
    .line 3
    invoke-direct {p0}, Lokio/AsyncTimeout;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public timedOut()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/n$c;->a:Ln9/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/n;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
