.class public final Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$c;
.super Lcom/lljjcoder/Interface/OnCityItemClickListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$c;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/lljjcoder/Interface/OnCityItemClickListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onSelected(Lcom/lljjcoder/bean/ProvinceBean;Lcom/lljjcoder/bean/CityBean;Lcom/lljjcoder/bean/DistrictBean;)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/lljjcoder/Interface/OnCityItemClickListener;->onSelected(Lcom/lljjcoder/bean/ProvinceBean;Lcom/lljjcoder/bean/CityBean;Lcom/lljjcoder/bean/DistrictBean;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    iget-object p3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$c;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 10
    .line 11
    invoke-static {p3}, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;->D(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;)Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$c;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;->C(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;)[Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    array-length v1, v0

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v3, v1, :cond_2

    .line 25
    .line 26
    aget-object v4, v0, v3

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const-string v6, "getName(...)"

    .line 33
    .line 34
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x2

    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-static {v5, v4, v2, v6, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {p2}, Lcom/lljjcoder/bean/CityBean;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :goto_1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->W(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$c;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 67
    .line 68
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;->D(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;)Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->P()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$c;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    .line 77
    .line 78
    const p2, 0x7f110188

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/base/CommonFragment;->j(I)V

    .line 82
    .line 83
    .line 84
    return-void
.end method
