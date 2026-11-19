.class public final synthetic Ln5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/internal/http2/c;

.field public final synthetic b:Ln5/p;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/c;Ln5/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/l;->a:Lokhttp3/internal/http2/c;

    iput-object p2, p0, Ln5/l;->b:Ln5/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln5/l;->a:Lokhttp3/internal/http2/c;

    iget-object v1, p0, Ln5/l;->b:Ln5/p;

    invoke-static {v0, v1}, Lokhttp3/internal/http2/c$d;->l(Lokhttp3/internal/http2/c;Ln5/p;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
