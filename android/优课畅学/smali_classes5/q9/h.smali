.class public final synthetic Lq9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lokhttp3/internal/http2/c;

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/c;ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/h;->a:Lokhttp3/internal/http2/c;

    iput p2, p0, Lq9/h;->b:I

    iput-object p3, p0, Lq9/h;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lq9/h;->a:Lokhttp3/internal/http2/c;

    iget v1, p0, Lq9/h;->b:I

    iget-object v2, p0, Lq9/h;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lokhttp3/internal/http2/c;->d(Lokhttp3/internal/http2/c;ILjava/util/List;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
