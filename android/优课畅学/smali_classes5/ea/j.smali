.class public final Lea/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca/h;


# static fields
.field public static final a:Lea/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lea/j;

    .line 2
    .line 3
    invoke-direct {v0}, Lea/j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lea/j;->a:Lea/j;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Li9/e0;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Li9/e0;->string()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li9/e0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lea/j;->a(Li9/e0;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
