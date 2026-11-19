.class public final synthetic Lge/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lge/f0;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lge/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lge/e0;->c:I

    iput-object p2, p0, Lge/e0;->d:Ljava/lang/String;

    iput-object p3, p0, Lge/e0;->e:Lge/f0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lge/e0;->c:I

    iget-object v1, p0, Lge/e0;->d:Ljava/lang/String;

    iget-object v2, p0, Lge/e0;->e:Lge/f0;

    invoke-static {v0, v1, v2}, Lge/f0;->v(ILjava/lang/String;Lge/f0;)[Lee/f;

    move-result-object v0

    return-object v0
.end method
