.class public final synthetic Ln5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/internal/http2/c$d;

.field public final synthetic b:Z

.field public final synthetic c:Ln5/s;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/c$d;ZLn5/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/m;->a:Lokhttp3/internal/http2/c$d;

    iput-boolean p2, p0, Ln5/m;->b:Z

    iput-object p3, p0, Ln5/m;->c:Ln5/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ln5/m;->a:Lokhttp3/internal/http2/c$d;

    iget-boolean v1, p0, Ln5/m;->b:Z

    iget-object v2, p0, Ln5/m;->c:Ln5/s;

    invoke-static {v0, v1, v2}, Lokhttp3/internal/http2/c$d;->n(Lokhttp3/internal/http2/c$d;ZLn5/s;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
