
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testsmartconseilapp.databinding.LastSocialActivityItemBinding
import com.example.testsmartconseilapp.model.SmActivitiy


class SocialMediaActivitesAdapter (var smActivities: MutableList<SmActivitiy>) :RecyclerView.Adapter<SocialMediaActivitesAdapter.SocialMediaActivitesViewHolder>() {

    inner class SocialMediaActivitesViewHolder(val mainView: LastSocialActivityItemBinding):RecyclerView.ViewHolder(mainView.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SocialMediaActivitesViewHolder {
        val mainView = LastSocialActivityItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return SocialMediaActivitesViewHolder(mainView)
    }

    override fun getItemCount(): Int {
        return smActivities.size
    }

    override fun onBindViewHolder(holder: SocialMediaActivitesViewHolder, position: Int) {
        val smActivitiy=smActivities[position]
        holder.mainView.tvAlertTitle.text=smActivitiy.title
        holder.mainView.tvTime.text=smActivitiy.time
        holder.mainView.tvAlertDesc.text=smActivitiy.desc
        holder.mainView.imageView4.setImageResource(smActivitiy.pic)

    }

}