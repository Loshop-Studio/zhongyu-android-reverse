.class public final Lg6/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lg6/h$h;

.field public final b:Lg6/h$d;

.field public c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lg6/h$h;Lg6/h$d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg6/h$a;->a:Lg6/h$h;

    .line 4
    iput-object p2, p0, Lg6/h$a;->b:Lg6/h$d;

    return-void
.end method

.method public synthetic constructor <init>(Lg6/h$h;Lg6/h$d;Lg6/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lg6/h$a;-><init>(Lg6/h$h;Lg6/h$d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/app/Activity;)Lu7/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg6/h$a;->b(Landroid/app/Activity;)Lg6/h$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Landroid/app/Activity;)Lg6/h$a;
    .locals 0

    .line 1
    invoke-static {p1}, Lz7/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p1, p0, Lg6/h$a;->c:Landroid/app/Activity;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic build()Lr7/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg6/h$a;->c()Lg6/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c()Lg6/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lg6/h$a;->c:Landroid/app/Activity;

    .line 2
    .line 3
    const-class v1, Landroid/app/Activity;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lz7/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lg6/h$b;

    .line 9
    .line 10
    iget-object v1, p0, Lg6/h$a;->a:Lg6/h$h;

    .line 11
    .line 12
    iget-object v2, p0, Lg6/h$a;->b:Lg6/h$d;

    .line 13
    .line 14
    iget-object v3, p0, Lg6/h$a;->c:Landroid/app/Activity;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3}, Lg6/h$b;-><init>(Lg6/h$h;Lg6/h$d;Landroid/app/Activity;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
