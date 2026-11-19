.class public final synthetic Lf5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lf5/h;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lf5/h;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/g;->a:Lf5/h;

    iput-object p2, p0, Lf5/g;->b:Ljava/util/List;

    iput-object p3, p0, Lf5/g;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lf5/g;->a:Lf5/h;

    iget-object v1, p0, Lf5/g;->b:Ljava/util/List;

    iget-object v2, p0, Lf5/g;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lf5/h;->a(Lf5/h;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
