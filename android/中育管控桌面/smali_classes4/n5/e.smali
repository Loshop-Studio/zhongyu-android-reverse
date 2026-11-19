.class public final synthetic Ln5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/internal/http2/c;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/e;->a:Lokhttp3/internal/http2/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln5/e;->a:Lokhttp3/internal/http2/c;

    invoke-static {v0}, Lokhttp3/internal/http2/c;->i(Lokhttp3/internal/http2/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
