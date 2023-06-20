
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testsmartconseilapp.databinding.AlertItemBinding
import com.example.testsmartconseilapp.model.Alert


class AlertsAdapter (var alerts: MutableList<Alert>) :RecyclerView.Adapter<AlertsAdapter.AlertsViewHolder>() {

    inner class AlertsViewHolder(val mainView: AlertItemBinding):RecyclerView.ViewHolder(mainView.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertsViewHolder {
        val mainView = AlertItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return AlertsViewHolder(mainView)
    }

    override fun getItemCount(): Int {
        return alerts.size
    }

    override fun onBindViewHolder(holder: AlertsViewHolder, position: Int) {
        var alert=alerts[position]
        holder.mainView.tvAlertTitle.text=alert.title
        holder.mainView.tvTime.text=alert.time
        holder.mainView.tvAlertDesc.text=alert.desc

    }

}