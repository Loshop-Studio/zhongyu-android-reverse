.class public final Le0/a$b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/a;->i(Landroid/content/Context;Le0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Le0/b;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le0/b;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le0/a$b;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Le0/a$b;->b:Le0/b;

    .line 4
    .line 5
    iput-object p3, p0, Le0/a$b;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Le0/a$b;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Le0/a$b;->b:Le0/b;

    .line 4
    .line 5
    iget-object v2, p0, Le0/a$b;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Le0/a;->e(Landroid/content/Context;Le0/b;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
