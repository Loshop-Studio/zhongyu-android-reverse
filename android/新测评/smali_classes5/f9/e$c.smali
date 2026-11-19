.class public final Lf9/e$c;
.super Lokio/AsyncTimeout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf9/e;-><init>(La9/v;La9/w;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lf9/e;


# direct methods
.method public constructor <init>(Lf9/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf9/e$c;->a:Lf9/e;

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
    iget-object v0, p0, Lf9/e$c;->a:Lf9/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf9/e;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
