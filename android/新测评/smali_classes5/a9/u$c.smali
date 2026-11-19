.class public final La9/u$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/u$c$a;
    }
.end annotation


# static fields
.field public static final c:La9/u$c$a;


# instance fields
.field public final a:La9/q;

.field public final b:La9/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La9/u$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La9/u$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La9/u$c;->c:La9/u$c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La9/q;La9/x;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La9/u$c;->a:La9/q;

    .line 4
    iput-object p2, p0, La9/u$c;->b:La9/x;

    return-void
.end method

.method public synthetic constructor <init>(La9/q;La9/x;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, La9/u$c;-><init>(La9/q;La9/x;)V

    return-void
.end method


# virtual methods
.method public final a()La9/x;
    .locals 1

    .line 1
    iget-object v0, p0, La9/u$c;->b:La9/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()La9/q;
    .locals 1

    .line 1
    iget-object v0, p0, La9/u$c;->a:La9/q;

    .line 2
    .line 3
    return-object v0
.end method
