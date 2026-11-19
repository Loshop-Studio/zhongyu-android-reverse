.class public final Lk5/n$c;
.super Lokio/AsyncTimeout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/n;-><init>(Lf5/a0;Lf5/b0;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lk5/n;


# direct methods
.method public constructor <init>(Lk5/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/n$c;->a:Lk5/n;

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
    iget-object v0, p0, Lk5/n$c;->a:Lk5/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/n;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
