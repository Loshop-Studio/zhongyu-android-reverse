.class public final synthetic Lf2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/common/helper/d;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/f;->c:Lcom/friday/common/helper/d;

    iput-object p2, p0, Lf2/f;->d:Ljava/lang/String;

    iput-object p3, p0, Lf2/f;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lf2/f;->c:Lcom/friday/common/helper/d;

    iget-object v1, p0, Lf2/f;->d:Ljava/lang/String;

    iget-object v2, p0, Lf2/f;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/friday/common/helper/d;->a(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
