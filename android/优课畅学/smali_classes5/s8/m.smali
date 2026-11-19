.class public final synthetic Ls8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Le8/c;

    check-cast p2, Ljava/util/List;

    invoke-static {p1, p2}, Ls8/p;->d(Le8/c;Ljava/util/List;)Ls8/b;

    move-result-object p1

    return-object p1
.end method
