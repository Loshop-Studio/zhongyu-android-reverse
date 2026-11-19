.class public final synthetic Ln9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lokhttp3/c;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln9/d;->a:Lokhttp3/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/d;->a:Lokhttp3/c;

    invoke-static {v0}, Ln9/e;->h(Lokhttp3/c;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
