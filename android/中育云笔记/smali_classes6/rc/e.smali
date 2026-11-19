.class public final synthetic Lrc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lrc/f;


# direct methods
.method public synthetic constructor <init>(Lrc/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrc/e;->c:Lrc/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lrc/e;->c:Lrc/f;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {v0, p1}, Lrc/f;->a(Lrc/f;Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
