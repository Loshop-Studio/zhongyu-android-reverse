.class public final synthetic Lq9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lokhttp3/internal/http2/c;

.field public final synthetic b:Lq9/p;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/c;Lq9/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/l;->a:Lokhttp3/internal/http2/c;

    iput-object p2, p0, Lq9/l;->b:Lq9/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lq9/l;->a:Lokhttp3/internal/http2/c;

    iget-object v1, p0, Lq9/l;->b:Lq9/p;

    invoke-static {v0, v1}, Lokhttp3/internal/http2/c$d;->m(Lokhttp3/internal/http2/c;Lq9/p;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
