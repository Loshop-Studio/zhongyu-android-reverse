.class public final synthetic Lk5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/c;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/d;->a:Lokhttp3/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/d;->a:Lokhttp3/c;

    invoke-static {v0}, Lk5/e;->h(Lokhttp3/c;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
